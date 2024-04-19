package net.hicare.hicaretest.repository

import android.util.Log
import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.hicare.hicaretest.data.db.dao.FacilityDao
import net.hicare.hicaretest.data.entity.FacilityEntity
import net.hicare.hicaretest.model.FacilityData
import net.hicare.hicaretest.network.FacilityApi
import javax.inject.Inject
import javax.inject.Singleton

class FacilityRepository @Inject constructor(private val facilityApi: FacilityApi, private val facilityDao: FacilityDao) {

    suspend fun refreshFacilities(): Result<List<FacilityData>> {
        return try {
            val response = facilityApi.getFacilities()
            Log.d("TAG", "refreshFacilities: $response")
            if (response.isSuccessful) {
                response.body()?.data?.let { newData ->
                    facilityDao.insertAll(newData.map { apiFacility ->
                        FacilityEntity(
                            facilityId = apiFacility.facilityId,
                            facilityName = apiFacility.facilityName,
                            logoUrl = apiFacility.logoUrl
                        )
                    })
                    Result.success(newData)
                } ?: Result.failure(Exception("No data available"))
            } else {
                Result.failure(Exception("Failed to fetch facilities: ${response.message()}"))
            }
        } catch (e: Exception) {
            Result.failure(Exception("Network error: Couldn't fetch facilities", e))
        }
    }

    suspend fun saveFacility(facility: FacilityData) {
        facilityDao.insert(FacilityEntity(
            facilityId = facility.facilityId,
            facilityName = facility.facilityName,
            logoUrl = facility.logoUrl
        ))
    }
}