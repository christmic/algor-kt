package com.christmc.algor.kt

class RemoveElement27 {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var s = 0
        var f = 0
        while (f < nums.size) {
            if (nums[f] == `val`) {
                f++
            }
            else {
                nums[s] = nums[f]
                s++
                f++
            }
        }

        return s
    }
}