package com.choimingyu.hicarenettest.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/choimingyu/hicarenettest/viewmodel/FacilityViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/choimingyu/hicarenettest/repository/FacilityRepository;", "(Lcom/choimingyu/hicarenettest/repository/FacilityRepository;)V", "errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "facilities", "", "Lcom/choimingyu/hicarenettest/model/FacilityData;", "getFacilities", "selectedFacility", "getSelectedFacility", "loadFacilities", "", "saveSelectedFacility", "selectFacility", "facility", "app_debug"})
public final class FacilityViewModel extends androidx.lifecycle.ViewModel {
    private final com.choimingyu.hicarenettest.repository.FacilityRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.choimingyu.hicarenettest.model.FacilityData>> facilities = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.choimingyu.hicarenettest.model.FacilityData> selectedFacility = null;
    
    @javax.inject.Inject()
    public FacilityViewModel(@org.jetbrains.annotations.NotNull()
    com.choimingyu.hicarenettest.repository.FacilityRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.choimingyu.hicarenettest.model.FacilityData>> getFacilities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.choimingyu.hicarenettest.model.FacilityData> getSelectedFacility() {
        return null;
    }
    
    public final void loadFacilities() {
    }
    
    public final void selectFacility(@org.jetbrains.annotations.NotNull()
    com.choimingyu.hicarenettest.model.FacilityData facility) {
    }
    
    public final void saveSelectedFacility() {
    }
}