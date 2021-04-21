package com.example.android_starter.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    private val _text = MutableStateFlow("Home Fragment")
    val text: LiveData<String> = _text.asLiveData()
}