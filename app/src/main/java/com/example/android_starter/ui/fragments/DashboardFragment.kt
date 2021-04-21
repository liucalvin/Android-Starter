package com.example.android_starter.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.annotation.VisibleForTesting
import androidx.fragment.app.Fragment
import com.example.android_starter.R
import com.example.android_starter.databinding.FragmentDashboardBinding
import com.example.android_starter.ui.viewmodels.DashboardViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    @VisibleForTesting
    private val binding by viewBinding(FragmentDashboardBinding::bind)
    private val viewModel: DashboardViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.text.observe(viewLifecycleOwner, {
            binding.textDashboard.text = it
        })
    }
}