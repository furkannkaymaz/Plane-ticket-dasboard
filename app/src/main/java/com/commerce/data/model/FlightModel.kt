package com.commerce.data.model

data class FlightModel (
    val data: Data? = null
)

data class Data (
    val searchParameters: SearchParameters? = null,
    val createdAt: String? = null,
    val airlines: List<Airline>? = null,
    val airports: List<Airport>? = null,
    val stopCounts: List<Long>? = null,
    val baggages: List<Long>? = null,
    val filterBoundaries: FilterBoundaries? = null,
    val hasViFlight: Boolean? = null,
    val infoMessage: Any? = null,
    val searchURL: String? = null,
    val shortSearchURL: String? = null,
    val currencies: Currencies? = null,
    val busSearchDataTab: Any? = null,
    val flights: Flights? = null,
    val priceHistory: PriceHistory? = null
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
    val airportName: String? = null,
    val cityCode: String? = null,
    val cityName: String? = null,
    val citySlug: String? = null,
    val countryCode: String? = null,
    val countryName: String? = null,
    val label: String? = null,
    val isCity: Boolean? = null
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
    val departurePrice: Price? = null,
    val returnPrice: Price? = null,
    val departureMaxDuration: Long? = null,
    val returnMaxDuration: Long? = null
)

data class Price (
    val min: Long? = null,
    val max: Long? = null
)

data class Flights (
    val departure: List<DepartureElement>? = null
)

data class DepartureElement (
    val enuid: String? = null,
    val priceBreakdown: PriceBreakdown? = null,
    val averagePriceBreakdown: PriceBreakdown? = null,
    val infos: Infos? = null,
    val providerPackages: List<Any?>? = null,
    val segments: List<Segment>? = null,
    val differentAirlineCount: Long? = null
)

data class PriceBreakdown (
    val base: Double? = null,
    val tax: Double? = null,
    val service: Double? = null,
    val reissueService: Long? = null,
    val total: Double? = null,
    val currency: Currency? = null,
    val discount: Long? = null,
    val displayedCurrency: DisplayedCurrency? = null,
    val internalAssurance: Long? = null,
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
    val isReservable: Boolean? = null,
    val isPromo: Boolean? = null,
    val duration: Duration? = null,
    val baggageInfo: BaggageInfo? = null,
    val isVirtualInterlining: Boolean? = null,
    val isBusiness: Boolean? = null,
    val activeWarning: Any? = null,
    val isMaskRequired: Boolean? = null
)

data class BaggageInfo (
    val carryOn: CarryOn? = null,
    val firstBaggageCollection: List<FirstBaggageCollection>? = null
)

data class CarryOn (
    val allowance: Long? = null,
    val type: Type? = null,
    val unit: Unit? = null,
    val part: Long? = null,
    val isSmall: Boolean? = null
)

enum class Type {
    Weight
}

enum class Unit {
    Kg
}

data class FirstBaggageCollection (
    val paxType: PaxType? = null,
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
    val totalMinutes: Long? = null
)

data class Segment (
    val departureDatetime: Datetime? = null,
    val displayDepartureDatetime: DisplayDatetime? = null,
    val arrivalDatetime: Datetime? = null,
    val displayArrivalDatetime: DisplayDatetime? = null,
    val segmentClass: String? = null,
    val flightNumber: String? = null,
    val origin: String? = null,
    val destination: String? = null,
    val marketingAirline: String? = null,
    val operatingAirline: String? = null,
    val availableSeats: Long? = null,
    val originTerminal: String? = null,
    val destinationTerminal: String? = null,
    val segmentDelay: Duration? = null,
    val duration: Duration? = null,
    val isTrain: Boolean? = null,
    val segmentAttributes: SegmentAttributes? = null,
    val isVirtualInterlining: Boolean? = null
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
    val freeMeal: Boolean? = null,
    val seatPitch: String? = null,
    val airplaneBrand: AirplaneBrand? = null,
    val entertainment: Entertainment? = null,
    val wifi: Long? = null,
    val seatPlan: SeatPlan? = null
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
    val requestID: String? = null,
    val provider: Any? = null,
    val origin: Airport? = null,
    val destination: Airport? = null,
    val origins: List<Airport>? = null,
    val destinations: List<Airport>? = null,
    val departureDates: List<String>? = null,
    val departureDate: String? = null,
    val displayDepartureDate: String? = null,
    val displayDepartureDates: List<String>? = null,
    val returnDate: Any? = null,
    val displayReturnDate: Any? = null,
    val adult: Long? = null,
    val senior: Long? = null,
    val student: Long? = null,
    val child: Long? = null,
    val infant: Long? = null,
    val passengerCount: Long? = null,
    val passengerServisableCount: Long? = null,
    val version: Long? = null,
    val isOneWay: Boolean? = null,
    val isDomestic: Boolean? = null,
    val isDirect: Boolean? = null,
    val isRefundable: Boolean? = null,
    val flightClass: String? = null
)
