package com.commerce.ui.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.commerce.base.BaseAdapter
import com.commerce.data.model.FlightModel
import com.commerce.databinding.ItemFlightBinding

class HomeAdapter(
    private val itemClick: ((FlightModel) -> Unit)?
) :
    BaseAdapter<FlightModel, HomeAdapter.ViewHolder>() {

    override fun bindView(holder: ViewHolder, position: Int, item: FlightModel) {


        holder.binding.container.setOnClickListener {}

    }

    override fun createView(
        context: Context,
        parent: ViewGroup,
        inflater: LayoutInflater,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(ItemFlightBinding.inflate(inflater, parent, false))
    }

    class ViewHolder(val binding: ItemFlightBinding) :
        RecyclerView.ViewHolder(binding.root)

}