package com.christmc.algor.kt

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun nextGreatestLetter() {
        val r = Solution().nextGreatestLetter(
            charArrayOf('c', 'f', 'j'), 'a'
        )
        assertEquals('c', r)
    }
    @Test
    fun nextGreatestLetter2() {
        val r = Solution().nextGreatestLetter(
            charArrayOf('x', 'x', 'y','y'), 'z'
        )
        assertEquals('x', r)
    }
}