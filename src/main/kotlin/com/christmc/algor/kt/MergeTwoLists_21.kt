package com.christmc.algor.kt

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class MergeTwoLists21 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val head = ListNode(-1)
        var p = head
        var l1 = list1
        var l2 = list2

        while (l1 != null && l2 != null) {
            if (l1.`val` <= l2.`val`){
                p.next = l1
                l1 = l1.next
            }
            else if (l1.`val` > l2.`val`) {
                p.next = l2
                l2 = l2.next
            }
            p = p.next!!
        }

        if (l1 != null)
            p.next = l1

        if (l2 != null)
            p.next = l2

        return head.next

    }

    class ListNode(var `val`: Int) {
         var next: ListNode? = null
    }
}