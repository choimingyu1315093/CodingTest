package com.choimingyu.hicarenettest.network

import com.choimingyu.hicarenettest.model.FacilityResponse
import retrofit2.Response
import retrofit2.http.GET

interface FacilityApi {
    @GET("all/facility")
    suspend fun getFacilities(): Response<FacilityResponse>
}