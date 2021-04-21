package com.example.android_starter.di

import com.example.android_starter.ui.viewmodels.DashboardViewModel
import com.example.android_starter.ui.viewmodels.HomeViewModel
import com.example.android_starter.ui.viewmodels.NotificationsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeFragmentModule = module {
    viewModel { HomeViewModel() }
}

val dashboardFragmentModule = module {
    viewModel { DashboardViewModel() }
}

val notificationsFragmentModule = module {
    viewModel { NotificationsViewModel() }
}