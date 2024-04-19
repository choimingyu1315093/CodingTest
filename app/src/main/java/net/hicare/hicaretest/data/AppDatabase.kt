package net.hicare.hicaretest.data

import androidx.room.Database
import androidx.room.RoomDatabase
import net.hicare.hicaretest.data.db.dao.FacilityDao
import net.hicare.hicaretest.data.entity.FacilityEntity

@Database(entities = [FacilityEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun facilityDao(): FacilityDao
}