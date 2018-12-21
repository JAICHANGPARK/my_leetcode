class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var p1 = l1
        var p2 = l2
        var carry = 0
        var sum = 0
        val dummyHead: ListNode = ListNode(0)
        var curr: ListNode? = dummyHead
        while (p1 != null || p2 != null || carry != 0) {
            sum = getValueOrZero(p1) + getValueOrZero(p2) + carry
            carry = sum / 10
            curr?.next = ListNode(sum % 10)
            curr = curr?.next
            p1 = p1?.next
            p2 = p2?.next
        }
        return dummyHead.next
    }
    
    private fun getValueOrZero(l: ListNode?): Int {
        return l?.`val` ?: 0
    }
}