package com.example.android_starter.di

import com.example.android_starter.db.ExampleDatabase
import com.example.android_starter.network.BASE_URL
import com.example.android_starter.network.WebService
import com.example.android_starter.repository.ExampleRepository
import com.example.android_starter.repository.ExampleRepositoryImpl
import com.example.android_starter.ui.viewmodels.DashboardViewModel
import com.example.android_starter.ui.viewmodels.HomeViewModel
import com.example.android_starter.ui.viewmodels.NotificationsViewModel
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import kotlin.math.sin

val homeFragmentModule = module {
    viewModel { HomeViewModel() }
}

val dashboardFragmentModule = module {
    viewModel { DashboardViewModel() }
}

val notificationsFragmentModule = module {
    viewModel { NotificationsViewModel() }
}

val exampleRepositoryModule = module {
    single<ExampleRepository> { ExampleRepositoryImpl(get()) }
}

val exampleDatabaseModule = module {
    single { ExampleDatabase.getInstance(get()) }
}

val apiModule = module {
    fun getApi(retrofit: Retrofit): WebService {
        return retrofit.create(WebService::class.java)
    }
    single { getApi(get()) }
}

val retrofitModule = module {
    fun getMoshi() = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    fun getRetrofit(moshi: Moshi) = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

    single { getMoshi() }
    single { getRetrofit(get()) }
}