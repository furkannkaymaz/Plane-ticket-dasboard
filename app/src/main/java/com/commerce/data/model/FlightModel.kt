package com.commerce.data.model

data class FlightModel (
    val data: Data? = null
)

data class Data (
    val search_parameters: SearchParameters? = null,
    val created_at: String? = null,
    val airlines: List<Airline>? = null,
    val airports: List<Airport>? = null,
    val stop_counts: List<Long>? = null,
    val baggages: List<Long>? = null,
    val filter_boundaries: FilterBoundaries? = null,
    val has_vi_Flight: Boolean? = null,
    val info_message: Any? = null,
    val search_URL: String? = null,
    val shortSearch_url: String? = null,
    val currencies: Currencies? = null,
    val bus_search_data_tab: Any? = null,
    val flights: Flights? = null,
    val price_history: PriceHistory? = null
)

data class Airline (
    val code: String? = null,
    val name: String? = null,
    val slug: String? = null,
    val image: String? = null
)

data class Airport (
    val id: String? = null,
    val slug: String? = null,
    val airport_name: String? = null,
    val city_code: String? = null,
    val city_name: String? = null,
    val city_slug: String? = null,
    val country_code: String? = null,
    val country_name: String? = null,
    val label: String? = null,
    val is_city: Boolean? = null
)

data class Currencies (
    val aed: String? = null,
    val ars: String? = null,
    val aud: String? = null,
    val azn: String? = null,
    val bdt: String? = null,
    val bhd: String? = null,
    val bob: String? = null,
    val brl: String? = null,
    val byn: String? = null,
    val cad: String? = null,
    val chf: String? = null,
    val clp: String? = null,
    val cny: String? = null,
    val cop: String? = null,
    val crc: String? = null,
    val dkk: String? = null,
    val dzd: String? = null,
    val egp: String? = null,
    val eur: String? = null,
    val gbp: String? = null,
    val hkd: String? = null,
    val ils: String? = null,
    val inr: String? = null,
    val iqd: String? = null,
    val jod: String? = null,
    val jpy: String? = null,
    val kgs: String? = null,
    val krw: String? = null,
    val kwd: String? = null,
    val kzt: String? = null,
    val lbp: String? = null,
    val lkr: String? = null,
    val mad: String? = null,
    val mxn: String? = null,
    val myr: String? = null,
    val nok: String? = null,
    val nzd: String? = null,
    val omr: String? = null,
    val pab: String? = null,
    val pen: String? = null,
    val php: String? = null,
    val pkr: String? = null,
    val qar: String? = null,
    val rub: String? = null,
    val sar: String? = null,
    val sek: String? = null,
    val sgd: String? = null,
    val thb: String? = null,
    val tnd: String? = null,
    val currenciesTRY: String? = null,
    val twd: String? = null,
    val usd: String? = null,
    val enc: Long? = null
)

data class FilterBoundaries (
    val departure_price: Price? = null,
    val return_price: Price? = null,
    val departure_max_duration: Long? = null,
    val return_max_duration: Long? = null
)

data class Price (
    val min: Long? = null,
    val max: Long? = null
)

data class Flights (
    val departure: ArrayList<DepartureElement?>? = null
)

data class DepartureElement (
    val enuid: String? = null,
    val price_breakdown: PriceBreakdown? = null,
    val average_price_breakdown: PriceBreakdown? = null,
    val infos: Infos? = null,
    val provider_packages: List<Any?>? = null,
    val segments: List<Segment>? = null,
    val different_airline_count: Long? = null
)

data class PriceBreakdown (
    val base: Double? = null,
    val tax: Double? = null,
    val service: Double? = null,
    val reissues_service: Long? = null,
    val total: Double? = null,
    val currency: Currency? = null,
    val discount: Long? = null,
    val displayed_currency: DisplayedCurrency? = null,
    val internal_assurance: Long? = null,
    val extraFee: Double? = null,
    val penalty: Long? = null
)

enum class Currency {
    Try
}

enum class DisplayedCurrency {
    Tl
}

data class Infos (
    val is_reservable: Boolean? = null,
    val is_promo: Boolean? = null,
    val duration: Duration? = null,
    val baggage_info: BaggageInfo? = null,
    val is_virtual_interlining: Boolean? = null,
    val is_business: Boolean? = null,
    val active_warning: Any? = null,
    val is_mask_required: Boolean? = null
)

data class BaggageInfo (
    val carry_on: CarryOn? = null,
    val firstBaggageCollection: List<FirstBaggageCollection>? = null
)

data class CarryOn (
    val allowance: Long? = null,
    val type: Type? = null,
    val unit: Unit? = null,
    val part: Long? = null,
    val is_small: Boolean? = null
)

enum class Type {
    Weight
}

enum class Unit {
    Kg
}

data class FirstBaggageCollection (
    val pax_type: PaxType? = null,
    val allowance: Long? = null,
    val part: Long? = null,
    val unit: Unit? = null,
    val type: Type? = null,
    val small: Boolean? = null
)

enum class PaxType {
    Adult
}

data class Duration (
    val day: Long? = null,
    val hour: Long? = null,
    val minute: Long? = null,
    val total_Minutes: Long? = null
)

data class Segment (
    val departure_datetime: Datetime? = null,
    val display_departure_datetime: DisplayDatetime? = null,
    val arrival_datetime: Datetime? = null,
    val display_arrival_datetime: DisplayDatetime? = null,
    val segment_class: String? = null,
    val flightN_number: String? = null,
    val origin: String? = null,
    val destination: String? = null,
    val marketing_airline: String? = null,
    val operating_airline: String? = null,
    val available_seats: Long? = null,
    val origin_terminal: String? = null,
    val destination_terminal: String? = null,
    val segment_delay: Duration? = null,
    val duration: Duration? = null,
    val isTrain: Boolean? = null,
    val segment_attributes: SegmentAttributes? = null,
    val is_virtual_interlining: Boolean? = null
)

data class Datetime (
    val date: Date? = null,
    val time: String? = null,
    val timestamp: Long? = null
)

enum class Date {
    The28062022,
    The29062022
}

enum class DisplayDatetime {
    The28Haziran2022SalU0131,
    The29Haziran2022U00C7ArU015Famba
}

data class SegmentAttributes (
    val free_meal: Boolean? = null,
    val seat_pitch: String? = null,
    val airplane_brand: AirplaneBrand? = null,
    val entertainment: Entertainment? = null,
    val wifi: Long? = null,
    val seat_plan: SeatPlan? = null
)

enum class AirplaneBrand {
    AirbusA319,
    AirbusA320,
    AirbusA321,
    AirbusA330200,
    Boeing737800,
    Boeing777300ER
}

enum class Entertainment {
    Overhead,
    Personal
}

enum class SeatPlan {
    The242,
    The33,
    The333
}

data class PriceHistory (
    val departure: PriceHistoryDeparture? = null
)

data class PriceHistoryDeparture (
    val previousDayPrice: Long? = null,
    val nextDayPrice: Long? = null
)

data class SearchParameters (
    val request_id: String? = null,
    val provider: Any? = null,
    val origin: Airport? = null,
    val destination: Airport? = null,
    val origins: List<Airport>? = null,
    val destinations: List<Airport>? = null,
    val departure_dates: List<String>? = null,
    val departure_date: String? = null,
    val display_departure_date: String? = null,
    val display_departure_dates: List<String>? = null,
    val returnDate: Any? = null,
    val display_return_date: Any? = null,
    val adult: Long? = null,
    val senior: Long? = null,
    val student: Long? = null,
    val child: Long? = null,
    val infant: Long? = null,
    val passengerCount: Long? = null,
    val passenger_servisable_count: Long? = null,
    val version: Long? = null,
    val is_One_way: Boolean? = null,
    val is_domestic: Boolean? = null,
    val is_direct: Boolean? = null,
    val is_refundable: Boolean? = null,
    val flight_class: String? = null
)
