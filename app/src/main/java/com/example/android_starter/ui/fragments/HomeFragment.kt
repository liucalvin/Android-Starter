package com.example.android_starter.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.annotation.VisibleForTesting
import androidx.fragment.app.Fragment
import com.example.android_starter.R
import com.example.android_starter.databinding.FragmentHomeBinding
import com.example.android_starter.ui.viewmodels.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment(R.layout.fragment_home) {

    @VisibleForTesting
    private val binding by viewBinding(FragmentHomeBinding::bind)
    private val viewModel: HomeViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.text.observe(viewLifecycleOwner, {
            binding.textHome.text = it
        })
    }
}