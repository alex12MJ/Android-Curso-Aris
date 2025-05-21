package com.jandro.horoscapp.data.providers

import com.jandro.horoscapp.domain.model.HoroscopeInfo
import com.jandro.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject


class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagitario,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}