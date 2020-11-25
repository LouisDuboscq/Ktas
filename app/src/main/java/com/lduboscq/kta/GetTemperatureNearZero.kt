package com.lduboscq.kta

import java.util.*

class GetTemperatureNearZero {

    operator fun invoke(numbers: List<Int>): Int {
        val minPositive = numbers.positives().min()
        val maxNegative = numbers.negatives().max()

        return if (minPositive != null && maxNegative != null) {
            if ((maxNegative * -1) < minPositive) maxNegative
            else minPositive
        } else {
            maxNegative ?: minPositive ?: 0
        }
    }

    private fun List<Int>.positives(): List<Int> = filter { it > 0 }
    private fun List<Int>.negatives(): List<Int> = filter { it < 0 }
}

/**
 * https://www.codingame.com/ide/puzzle/temperatures
 */
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    (0 until input.nextInt()).map {
        input.nextInt()
    }.also {
        println(GetTemperatureNearZero().invoke(it))
    }
}