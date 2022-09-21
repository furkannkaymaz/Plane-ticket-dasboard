package com.commerce.ui.custom_layouts

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import com.commerce.base.BaseLinearLayout
import com.commerce.databinding.CustomTopcontentBinding

class CustomTopContent(context: Context, attrs: AttributeSet? = null) :
    BaseLinearLayout<CustomTopcontentBinding>(context, attrs) {

    override fun createView(inflater: LayoutInflater): CustomTopcontentBinding {
        return CustomTopcontentBinding.inflate(inflater, this, true)
    }

    override fun viewCreated(attrs: AttributeSet?) {}

    fun setRouteText(text: String){
        binding.tvRoute.text = text
    }
}