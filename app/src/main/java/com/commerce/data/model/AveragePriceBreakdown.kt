package com.commerce.data.model

data class AveragePriceBreakdown(
    val base: Double?,
    val currency: String?,
    val discount: Int?,
    val displayed_currency: String?,
    val extra_fee: Int?,
    val internal_assurance: Int?,
    val penalty: Int?,
    val reissue_service: Int?,
    val service: Double?,
    val tax: Double?,
    val total: Double?
)