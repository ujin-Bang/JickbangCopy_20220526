package com.start.jickbangcopy_20220526.datas

import java.text.NumberFormat
import java.util.*

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) {

//    가격에 따라 다른 형태로 가공해서 가격을 알려주는 함수
    fun getFormattedPrice():String{

        if(this.price < 10000) {

            val priceStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            return priceStr
        }
        else {
            val uk = this.price / 10000 //정수 나누기 정수는 정수만 나온다. (소수점이하 자동 버림처림)
            val rest = this.price % 10000
            val restCommaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            val priceStr = "${uk}억 ${restCommaStr}"

            return priceStr
        }

    }
}