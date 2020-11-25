package com.lduboscq.kta

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class GetTempNearZeroTest {

    private lateinit var getTemperatureNearZero: GetTemperatureNearZero

    @Before
    fun before() {
        getTemperatureNearZero = GetTemperatureNearZero()
    }

    @Test
    fun positives() {
        assertEquals(2, getTemperatureNearZero(listOf(2, 4, 6)))
        assertEquals(1, getTemperatureNearZero(listOf(4, 1, 6)))
        assertEquals(3, getTemperatureNearZero(listOf(9, 4, 3)))
    }

    @Test
    fun negatives() {
        assertEquals(-1, getTemperatureNearZero(listOf(-1, -2, -5)))
        assertEquals(-2, getTemperatureNearZero(listOf(-6, -2, -5)))
        assertEquals(-5, getTemperatureNearZero(listOf(-10, -8, -5)))
    }

    @Test
    fun positivesAndNegatives() {
        assertEquals(-1, getTemperatureNearZero(listOf(-1, 2, 5)))
        assertEquals(1, getTemperatureNearZero(listOf(-1, 2, 1)))
        assertEquals(10, getTemperatureNearZero(listOf(10, -11, 12)))
    }
}