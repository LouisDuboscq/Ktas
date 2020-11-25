package com.lduboscq.kta

import java.util.*

class GetStockExchangeLosses {
    operator fun invoke(numbers: List<Int>): Int {
        var maxCrash = 0
        var maxTop = numbers[0]

        numbers.forEach {
            if (it > maxTop) maxTop = it
            else {
                val newCrash = -(maxTop - it)
                if (newCrash < maxCrash) maxCrash = newCrash
            }
        }
        return maxCrash
    }
}

/**
 * https://www.codingame.com/ide/puzzle/stock-exchange-losses
 */
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    (0 until input.nextInt()).map {
        input.nextInt()
    } .also {
        println(GetStockExchangeLosses().invoke(it))
    }
}
