package com.choimingyu.hicarenettest.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.choimingyu.hicarenettest.model.FacilityData
import com.choimingyu.hicarenettest.repository.FacilityRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FacilityViewModel @Inject constructor(private val repository: FacilityRepository) : ViewModel() {
    val facilities = MutableLiveData<List<FacilityData>>()
    val errorMessage = MutableLiveData<String>()
    val selectedFacility = MutableLiveData<FacilityData?>()

    fun loadFacilities() {
        viewModelScope.launch {
            repository.refreshFacilities().fold(
                onSuccess = { facilities ->
                    this@FacilityViewModel.facilities.postValue(facilities)
                },
                onFailure = { error ->
                    errorMessage.postValue(error.message ?: "An unknown error occurred")
                }
            )
        }
    }

    fun selectFacility(facility: FacilityData) {
        selectedFacility.value = facility
    }

    fun saveSelectedFacility() {
        selectedFacility.value?.let { facility ->
            viewModelScope.launch {
                try {
                    repository.saveFacility(facility)
                    errorMessage.postValue("Success")
                } catch (e: Exception) {
                    errorMessage.postValue("Failed")
                }
            }
        }
    }
}