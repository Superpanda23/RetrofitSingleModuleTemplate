package ph.alolodstudios.retrofitsinglemoduletemplate.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

//    @Provides
//    @Singleton
//    fun provideApi(): (NameOfApi) {
//        return Retrofit.Builder()
//            .baseUrl(Constants.BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(NameOfApi::class.java)
//    }


//    @Provides
//    @Singleton
//    fun provideCoinRepository(api: (NameOfApi)): Repository {
//        return RepositoryImpl(api)
//    }

}