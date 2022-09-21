package com.commerce.ui.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.commerce.base.BaseAdapter
import com.commerce.data.model.DepartureElement
import com.commerce.data.model.FlightModel
import com.commerce.data.model.Flights
import com.commerce.databinding.ItemFlightBinding

class HomeAdapter(
    private val itemClick: ((FlightModel) -> Unit)?
) :
    BaseAdapter<DepartureElement, HomeAdapter.ViewHolder>() {

    override fun bindView(holder: ViewHolder, position: Int, item: DepartureElement) {

        with(holder.binding) {

            if (!item.infos?.baggage_info?.firstBaggageCollection.isNullOrEmpty()){
               this.tvBaggage.text = "El Bagajı"
            }else{
                this.tvBaggage.text = item.infos?.baggage_info?.firstBaggageCollection?.first()?.allowance.toString() + "kg/kişi"
            }

            tvPrice.text = "${item.price_breakdown?.total} TL "
            holder.binding.tvFlyType.text = "Direkt Uçuş"

        }


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