package net.hicare.hicaretest.model

data class FacilityResponse(
    val statusCode: Int,
    val message: String,
    val data: List<FacilityData>
)

data class FacilityData(
    val facilityId: String,
    val facilityName: String,
    val logoUrl: String
)