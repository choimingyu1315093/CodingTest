package com.choimingyu.hicarenettest.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0086@\u00f8\u0001\u0002\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/choimingyu/hicarenettest/repository/FacilityRepository;", "", "facilityApi", "Lcom/choimingyu/hicarenettest/network/FacilityApi;", "facilityDao", "Lcom/choimingyu/hicarenettest/data/db/dao/FacilityDao;", "(Lcom/choimingyu/hicarenettest/network/FacilityApi;Lcom/choimingyu/hicarenettest/data/db/dao/FacilityDao;)V", "refreshFacilities", "Lkotlin/Result;", "", "Lcom/choimingyu/hicarenettest/model/FacilityData;", "refreshFacilities-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFacility", "", "facility", "(Lcom/choimingyu/hicarenettest/model/FacilityData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FacilityRepository {
    private final com.choimingyu.hicarenettest.network.FacilityApi facilityApi = null;
    private final com.choimingyu.hicarenettest.data.db.dao.FacilityDao facilityDao = null;
    
    @javax.inject.Inject()
    public FacilityRepository(@org.jetbrains.annotations.NotNull()
    com.choimingyu.hicarenettest.network.FacilityApi facilityApi, @org.jetbrains.annotations.NotNull()
    com.choimingyu.hicarenettest.data.db.dao.FacilityDao facilityDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveFacility(@org.jetbrains.annotations.NotNull()
    com.choimingyu.hicarenettest.model.FacilityData facility, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}