package com.commerce.ui.home.view

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.commerce.R
import com.commerce.base.BaseFragment
import com.commerce.databinding.FragmentHomeBinding
import com.commerce.ui.home.viewmodel.HomeViewModel
import com.commerce.utils.extension.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val viewModel by viewModels<HomeViewModel>()

    override fun configureUiItems() {
        tabLayoutConfigure()

    }

    override fun onCreateFinished() {
        viewModel.getData(requireActivity())

    }

    override fun observerData() {
        super.observerData()
        viewModel.getData.observe(viewLifecycleOwner) {
            Log.d("data1213", it?.data.toString())
        }
        viewModel.error.observe(viewLifecycleOwner) {
            context?.toast(getString(R.string.unExpectedError))
        }
    }

    private fun tabLayoutConfigure() {
        binding?.tbDate?.apply {
            newTab().text = "Önceki Gün \n 1.450 TL"
            newTab().text = "28 Haz Sal \n 1.450 TL"
            newTab().text = "Sonraki Gün \n 1.450 TL"
        }
    }

    override fun layoutResource(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

}