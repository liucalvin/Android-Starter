package com.example.android_starter.ui

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

// from https://zhuinden.medium.com/simple-one-liner-viewbinding-in-fragments-and-activities-with
// -kotlin-961430c6c07c
inline fun <T : ViewBinding> AppCompatActivity.viewBinding(
    crossinline bindingInflater: (LayoutInflater) -> T
) = lazy(LazyThreadSafetyMode.NONE) {
    bindingInflater.invoke(layoutInflater)
}