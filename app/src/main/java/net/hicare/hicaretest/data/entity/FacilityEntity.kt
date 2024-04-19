package net.hicare.hicaretest.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FacilityEntity(
    @PrimaryKey val facilityId: String,
    val facilityName: String,
    val logoUrl: String
)