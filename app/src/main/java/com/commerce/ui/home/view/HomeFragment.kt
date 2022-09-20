package com.commerce.ui.home.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.commerce.base.BaseFragment
import com.commerce.databinding.FragmentHomeBinding
import com.commerce.ui.home.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding,HomeViewModel>(){

    override val viewModel by viewModels<HomeViewModel>()

    override fun configureUiItems() {
    }

    override fun onCreateFinished() {
        viewModel.getData(requireActivity())

    }
    override fun layoutResource(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

}