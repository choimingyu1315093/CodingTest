package net.hicare.hicaretest.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.hicare.hicaretest.data.AppDatabase
import net.hicare.hicaretest.data.db.dao.FacilityDao
import net.hicare.hicaretest.network.FacilityApi
import net.hicare.hicaretest.util.Constants
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