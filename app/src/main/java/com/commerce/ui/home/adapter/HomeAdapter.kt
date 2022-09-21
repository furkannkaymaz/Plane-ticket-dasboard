package com.commerce.ui.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.FitCenter
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.commerce.base.BaseAdapter
import com.commerce.data.model.Airline
import com.commerce.data.model.Departure
import com.commerce.data.model.FlightModel
import com.commerce.databinding.ItemFlightBinding
import com.commerce.utils.extension.decode
import com.commerce.utils.extension.loadImage

class HomeAdapter(
    private val itemClick: ((FlightModel) -> Unit)?,
    private val airlines: ArrayList<Airline?>? = null
) :
    BaseAdapter<Departure, HomeAdapter.ViewHolder>() {

    override fun bindView(holder: ViewHolder, position: Int, item: Departure) {

        with(holder.binding) {

            if (item.infos?.baggage_info?.firstBaggageCollection.isNullOrEmpty()) {
                this.tvBaggage.text = "El Bagajı"
            } else {
                this.tvBaggage.text =
                    item.infos?.baggage_info?.firstBaggageCollection?.first()?.allowance.toString() + "kg/kişi"
            }

            tvPrice.text = "${item.price_breakdown?.total} TL "
            tvFlyType.text = "Direkt Uçuş"
            tvArivalTime.text = item.segments?.first()?.arrival_datetime?.time
            tvDepartureTime.text = item.segments?.first()?.departure_datetime?.time
            tvDeparture.text =
                "${item.segments?.first()?.origin} > ${item.segments?.first()?.destination} "
        }

        airlines?.forEach {
            if (item.segments?.first()?.marketing_airline == it?.code) {
                holder.binding.tvAirlines.text = it?.name?.let { it1 -> decode(it1) }
                it?.image?.let { holder.binding.ivCompany.loadImage(it.replace("\\", "")) }
            }
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