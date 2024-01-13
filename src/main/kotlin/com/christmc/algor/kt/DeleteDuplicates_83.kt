package com.christmc.algor.kt

class DeleteDuplicates83 {

    fun deleteDuplicates(head: ListNode?): ListNode? {

        var p = head ?: return null

        while (p.next != null) {
            if (p.`val` == p.next!!.`val`)
                p.next = p.next!!.next
            else
                p = p.next!!
        }

        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}