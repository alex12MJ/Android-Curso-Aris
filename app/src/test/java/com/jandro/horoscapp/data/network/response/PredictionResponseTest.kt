package com.jandro.horoscapp.data.network.response

import com.jandro.horoscapp.motherobject.HoroscopeModelObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Assert.*
import org.junit.Test
import kotlin.math.sign

class PredictionResponseTest {
    @Test
    fun `toDomainShouldReturnCorrectPredictionModel`() {

        //Given
        val horoscopeResponse = anyResponse

        //When
        val predictionModel = horoscopeResponse.toDomain()

        //Then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope

    }
}












