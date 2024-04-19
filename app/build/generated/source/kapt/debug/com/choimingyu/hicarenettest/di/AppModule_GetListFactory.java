// Generated by Dagger (https://dagger.dev).
package com.choimingyu.hicarenettest.di;

import com.choimingyu.hicarenettest.network.FacilityApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetListFactory implements Factory<FacilityApi> {
  @Override
  public FacilityApi get() {
    return getList();
  }

  public static AppModule_GetListFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FacilityApi getList() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.getList());
  }

  private static final class InstanceHolder {
    private static final AppModule_GetListFactory INSTANCE = new AppModule_GetListFactory();
  }
}