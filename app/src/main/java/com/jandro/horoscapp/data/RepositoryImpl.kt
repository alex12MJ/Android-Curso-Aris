package com.jandro.horoscapp.data

import android.util.Log
import com.jandro.horoscapp.data.network.HoroscopeApiService
import com.jandro.horoscapp.data.network.response.PredictionResponse
import com.jandro.horoscapp.domain.Repository
import com.jandro.horoscapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("jandro", "error ${it.message}") }

        return null
    }
}