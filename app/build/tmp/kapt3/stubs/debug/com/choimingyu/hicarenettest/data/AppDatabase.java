package com.choimingyu.hicarenettest.data;

import java.lang.System;

@androidx.room.Database(entities = {com.choimingyu.hicarenettest.data.entity.FacilityEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/choimingyu/hicarenettest/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "facilityDao", "Lcom/choimingyu/hicarenettest/data/db/dao/FacilityDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.choimingyu.hicarenettest.data.db.dao.FacilityDao facilityDao();
}