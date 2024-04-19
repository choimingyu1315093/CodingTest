package net.hicare.hicaretest.network

import net.hicare.hicaretest.model.FacilityResponse
import retrofit2.Response
import retrofit2.http.GET

interface FacilityApi {
    @GET("all/facility")
    suspend fun getFacilities(): Response<FacilityResponse>
}