package com.choimingyu.hicarenettest.repository

import android.util.Log
import com.choimingyu.hicarenettest.data.db.dao.FacilityDao
import com.choimingyu.hicarenettest.data.entity.FacilityEntity
import com.choimingyu.hicarenettest.model.FacilityData
import com.choimingyu.hicarenettest.network.FacilityApi
import javax.inject.Inject

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