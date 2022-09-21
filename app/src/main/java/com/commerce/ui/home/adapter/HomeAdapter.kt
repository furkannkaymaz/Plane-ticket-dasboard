package com.commerce.ui.home.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.commerce.R
import com.commerce.base.BaseAdapter
import com.commerce.data.model.Airline
import com.commerce.data.model.Departure
import com.commerce.databinding.ItemFlightBinding
import com.commerce.utils.checkString
import com.commerce.utils.editImageUrl
import com.commerce.utils.extension.decode
import com.commerce.utils.extension.loadImage

class HomeAdapter(
    private val airlines: ArrayList<Airline?>? = null
) :
    BaseAdapter<Departure, HomeAdapter.ViewHolder>() {

    @SuppressLint("SetTextI18n")
    override fun bindView(holder: ViewHolder, position: Int, item: Departure) {

        with(holder.binding) {

            if (item.infos?.baggage_info?.firstBaggageCollection.isNullOrEmpty()) {
                this.tvBaggage.text = tvBaggage.context.getString(R.string.hand_baggage)
            } else {
                this.tvBaggage.text =
                    item.infos?.baggage_info?.firstBaggageCollection?.first()?.allowance.toString() + "kg/kişi"
            }

            tvPrice.text = "${item.price_breakdown?.total} TL "
            tvFlyType.text = tvAirlines.context.getString(R.string.direct_flight)
            tvArivalTime.text = item.segments?.first()?.arrival_datetime?.time
            tvDepartureTime.text = item.segments?.first()?.departure_datetime?.time
            tvDeparture.text =
                "${item.segments?.first()?.origin} > ${item.segments?.first()?.destination} "
        }

        airlines?.forEach {
            if (item.segments?.first()?.marketing_airline == it?.code) {
                if (checkString(it?.name)) {
                    holder.binding.tvAirlines.text = decode(it?.name!!)
                }

                it?.image?.let { holder.binding.ivCompany.loadImage(editImageUrl(it)) }
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