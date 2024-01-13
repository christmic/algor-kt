package com.christmc.algor.kt

class Solution {

    // letters is asc
    // O(m)
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        for (letter in letters) {
            if (letter > target) return letter
        }
        return letters[0]
    }
}