package com.christmc.algor.kt

class Merge88 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var m1 = m - 1
        var n1 = n - 1
        var mn = m + n - 1
        while (m1 >= 0 && n1 >= 0) {
            if (nums1[m1] >= nums2[n1])
                nums1[mn--] = nums1[m1--]
            else
                nums1[mn--] = nums2[n1--]
        }

        while (m1 >= 0) {
            nums1[mn--] = nums1[m1--]
        }

        while (n1 >= 0) {
            nums1[mn--] = nums2[n1--]
        }
    }
}