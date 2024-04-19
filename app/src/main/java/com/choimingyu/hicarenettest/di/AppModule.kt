package com.choimingyu.hicarenettest.di

import android.content.Context
import androidx.room.Room
import com.choimingyu.hicarenettest.data.AppDatabase
import com.choimingyu.hicarenettest.data.db.dao.FacilityDao
import com.choimingyu.hicarenettest.network.FacilityApi
import com.choimingyu.hicarenettest.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getList(): FacilityApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FacilityApi::class.java)
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "hicare_database"
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideFacilityDao(database: AppDatabase): FacilityDao {
        return database.facilityDao()
    }
}