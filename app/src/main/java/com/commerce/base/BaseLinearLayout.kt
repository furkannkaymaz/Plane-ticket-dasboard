package com.commerce.base

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.viewbinding.ViewBinding

abstract class BaseLinearLayout<VB: ViewBinding>(context: Context, attrs: AttributeSet? = null) : LinearLayout(context, attrs) {

    lateinit var binding: VB

    open fun createView(inflater: LayoutInflater): VB? {
        return null
    }

    abstract fun viewCreated(attrs: AttributeSet?)

    init {
        this.createView(LayoutInflater.from(context))?.let {
            binding = it
        }
        this.viewCreated(attrs)
    }

}