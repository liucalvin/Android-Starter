package com.example.android_starter.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.annotation.VisibleForTesting
import androidx.fragment.app.Fragment
import com.example.android_starter.R
import com.example.android_starter.databinding.FragmentNotificationsBinding
import com.example.android_starter.ui.viewmodels.NotificationsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class NotificationsFragment : Fragment(R.layout.fragment_notifications) {

    @VisibleForTesting
    private val binding by viewBinding(FragmentNotificationsBinding::bind)
    private val viewModel: NotificationsViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.text.observe(viewLifecycleOwner, {
            binding.textNotifications.text = it
        })
    }

}