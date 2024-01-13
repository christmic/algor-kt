package com.christmc.algor.kt

class RemoveDuplicates26 {
    fun removeDuplicates(nums: IntArray): Int {
        var s = 0
        var f = 0

        while (f + 1 < nums.size) {
            if (nums[s] != nums[f + 1]) {
                nums[s + 1] = nums[f + 1]
                s++
            }
            f++
        }

        return s + 1
    }
}