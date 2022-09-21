package com.commerce.data.model

data class İnfos(
    val active_warning: Any?,
    val baggage_info: Baggageİnfo?,
    val duration: Duration?,
    val is_business: Boolean?,
    val is_mask_required: Boolean?,
    val is_promo: Boolean?,
    val is_reservable: Boolean?,
    val is_virtual_interlining: Boolean?
)