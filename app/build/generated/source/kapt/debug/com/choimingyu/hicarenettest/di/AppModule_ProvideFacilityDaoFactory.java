// Generated by Dagger (https://dagger.dev).
package com.choimingyu.hicarenettest.di;

import com.choimingyu.hicarenettest.data.AppDatabase;
import com.choimingyu.hicarenettest.data.db.dao.FacilityDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideFacilityDaoFactory implements Factory<FacilityDao> {
  private final Provider<AppDatabase> databaseProvider;

  public AppModule_ProvideFacilityDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public FacilityDao get() {
    return provideFacilityDao(databaseProvider.get());
  }

  public static AppModule_ProvideFacilityDaoFactory create(Provider<AppDatabase> databaseProvider) {
    return new AppModule_ProvideFacilityDaoFactory(databaseProvider);
  }

  public static FacilityDao provideFacilityDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideFacilityDao(database));
  }
}