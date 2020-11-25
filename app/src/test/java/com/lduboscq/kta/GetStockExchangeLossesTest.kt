package com.lduboscq.kta

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class GetStockExchangeLossesTest {

    private lateinit var getStockExchangeLosses: GetStockExchangeLosses

    @Before
    fun before() {
        getStockExchangeLosses = GetStockExchangeLosses()
    }

    @Test
    fun onlyAscending() {
        assertEquals(0, getStockExchangeLosses(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun flat() {
        assertEquals(0, getStockExchangeLosses(listOf(4, 4, 4, 4, 4)))
    }

    @Test
    fun onlyDescending() {
        assertEquals(-4, getStockExchangeLosses(listOf(4, 3, 2, 1, 0)))
    }

    @Test
    fun descendingAndAscending() {
        assertEquals(-2, getStockExchangeLosses(listOf(5, 3, 4)))
        assertEquals(-3, getStockExchangeLosses(listOf(4, 2, 3, 1)))
    }
}