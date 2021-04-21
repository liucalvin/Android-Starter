package com.example.android_starter.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.MutableStateFlow

class NotificationsViewModel : ViewModel() {

    private val _text = MutableStateFlow("Notifications Fragment")
    val text: LiveData<String> = _text.asLiveData()
}