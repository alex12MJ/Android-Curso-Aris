package com.jandro.horoscapp.data.network.response

import com.google.gson.annotations.SerializedName
import com.jandro.horoscapp.domain.model.PredictionModel

data class PredictionResponse
    (
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String
) {
    fun toDomain(): PredictionModel {
        return PredictionModel(
            horoscope = horoscope,
            sign = sign
        )
    }
}
