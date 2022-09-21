package com.commerce.ui.home.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.commerce.R
import com.commerce.base.BaseFragment
import com.commerce.data.model.Airline
import com.commerce.databinding.FragmentHomeBinding
import com.commerce.ui.home.adapter.HomeAdapter
import com.commerce.ui.home.viewmodel.HomeViewModel
import com.commerce.utils.checkArray
import com.commerce.utils.extension.toast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val viewModel by viewModels<HomeViewModel>()
    private lateinit var adapter: HomeAdapter

    override fun configureUiItems() {
        tabLayoutConfigure()
        bindRecycleView()

    }

    override fun onCreateFinished() {

        CoroutineScope(Dispatchers.Main).launch {
            viewModel.getData(requireActivity())
        }
    }

    override fun observerData() {
        super.observerData()
        viewModel.getData.observe(viewLifecycleOwner) {
            if (checkArray(arrayListOf(it))) {
                passAirlineData(it?.data?.airlines)
                adapter.set(it?.data?.flights?.departure)
                topContentConfigure(
                    "${
                        it?.data?.flights?.departure?.get(0)?.segments?.get(
                            0
                        )?.origin
                    } > ${it?.data?.flights?.departure?.get(0)?.segments?.get(0)?.destination}"
                )
                adapter.notifyDataSetChanged()

            }
        }
        viewModel.error.observe(viewLifecycleOwner) {
            context?.toast(it)
        }
        viewModel.isLoading.observe(viewLifecycleOwner) {
            if (it == false) {
                binding?.flContainer?.visibility = View.GONE
            } else {
                binding?.flContainer?.visibility = View.VISIBLE
            }
        }
    }

    private fun tabLayoutConfigure() {
        binding?.tbDate?.newTab()?.setText("Önceki Gün \n 1.450 TL")
            ?.let { binding?.tbDate?.addTab(it) }
        binding?.tbDate?.newTab()?.setText("28 Haz Sal \n 1.450 TL")
            ?.let { binding?.tbDate?.addTab(it) }
        binding?.tbDate?.newTab()?.setText("Sonraki Gün 1.450 TL")
            ?.let { binding?.tbDate?.addTab(it) }
    }

    private fun bindRecycleView() {
        binding?.rvFlights?.layoutManager = LinearLayoutManager(
            requireContext(),
            RecyclerView.VERTICAL,
            false
        )

    }

    private fun passAirlineData(airline: ArrayList<Airline?>?) {
        adapter = HomeAdapter(airline)
        binding?.rvFlights?.adapter = adapter
    }

    private fun topContentConfigure(sRoute: String) {
        binding?.contentTop?.setRouteText(sRoute)
    }

    override fun layoutResource(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

}