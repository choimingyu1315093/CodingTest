package net.hicare.hicaretest.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.hicare.hicaretest.data.db.dao.FacilityDao
import net.hicare.hicaretest.data.entity.FacilityEntity
import net.hicare.hicaretest.model.FacilityData
import net.hicare.hicaretest.network.FacilityApi
import net.hicare.hicaretest.repository.FacilityRepository
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