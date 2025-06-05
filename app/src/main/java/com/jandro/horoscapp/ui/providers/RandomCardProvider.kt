package com.jandro.horoscapp.ui.providers

import com.jandro.horoscapp.R
import com.jandro.horoscapp.ui.model.LuckyModel
import javax.inject.Inject
import kotlin.random.Random


class RandomCardProvider @Inject constructor() {
    fun getLucky(): LuckyModel? {
        return when (Random.nextInt(0, 32)) {
            0 -> LuckyModel(R.drawable.card_fool, R.string.luck_01)
            1 -> LuckyModel(R.drawable.card_moon, R.string.luck_02)
            2 -> LuckyModel(R.drawable.card_back, R.string.luck_03)
            3 -> LuckyModel(R.drawable.card_star, R.string.luck_04)
            4 -> LuckyModel(R.drawable.card_death, R.string.luck_05)
            5 -> LuckyModel(R.drawable.card_devil, R.string.luck_06)
            6 -> LuckyModel(R.drawable.card_sword, R.string.luck_07)
            7 -> LuckyModel(R.drawable.card_tower, R.string.luck_08)
            8 -> LuckyModel(R.drawable.card_world, R.string.luck_09)
            9 -> LuckyModel(R.drawable.card_judgement, R.string.luck_10)
            10 -> LuckyModel(R.drawable.card_priestess, R.string.luck_11)
            11 -> LuckyModel(R.drawable.card_hermit, R.string.luck_12)
            12 -> LuckyModel(R.drawable.card_lovers, R.string.luck_13)
            13 -> LuckyModel(R.drawable.card_sun, R.string.luck_14)
            14 -> LuckyModel(R.drawable.card_chariot, R.string.luck_15)
            15 -> LuckyModel(R.drawable.card_empress, R.string.luck_16)
            16 -> LuckyModel(R.drawable.card_hierophant, R.string.luck_17)
            17 -> LuckyModel(R.drawable.card_temperance, R.string.luck_18)
            18 -> LuckyModel(R.drawable.card_justice, R.string.luck_19)
            19 -> LuckyModel(R.drawable.card_reverse, R.string.luck_20)
            20 -> LuckyModel(R.drawable.card_magician, R.string.luck_21)
            21 -> LuckyModel(R.drawable.card_strength, R.string.luck_22)
            22 -> LuckyModel(R.drawable.card_king_cups, R.string.luck_23)
            23 -> LuckyModel(R.drawable.card_queen_cup, R.string.luck_24)
            24 -> LuckyModel(R.drawable.card_back_small, R.string.luck_25)
            25 -> LuckyModel(R.drawable.card_king_wands, R.string.luck_26)
            26 -> LuckyModel(R.drawable.card_king_swords, R.string.luck_27)
            27 -> LuckyModel(R.drawable.card_king_pentacles, R.string.luck_28)
            28 -> LuckyModel(R.drawable.card_page_wands, R.string.luck_29)
            29 -> LuckyModel(R.drawable.card_two_pentacles, R.string.luck_30)
            30 -> LuckyModel(R.drawable.card_queen_wands, R.string.luck_31)
            31 -> LuckyModel(R.drawable.card_wheel_fortune, R.string.luck_32)

            else -> null
        }
    }
}