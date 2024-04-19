package com.choimingyu.hicarenettest.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.choimingyu.hicarenettest.data.db.dao.FacilityDao
import com.choimingyu.hicarenettest.data.entity.FacilityEntity

@Database(entities = [FacilityEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun facilityDao(): FacilityDao
}