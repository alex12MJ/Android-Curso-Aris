package com.jandro.horoscapp.domain

import com.jandro.horoscapp.data.network.response.PredictionResponse
import com.jandro.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}