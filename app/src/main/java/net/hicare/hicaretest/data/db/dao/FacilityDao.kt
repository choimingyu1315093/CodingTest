package net.hicare.hicaretest.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import net.hicare.hicaretest.data.entity.FacilityEntity

@Dao
interface FacilityDao {
    @Query("SELECT * FROM FacilityEntity")
    fun getAllFacilities(): LiveData<List<FacilityEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(facilities: List<FacilityEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(facility: FacilityEntity)
}