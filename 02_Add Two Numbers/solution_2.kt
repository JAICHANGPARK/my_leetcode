class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var dummyHead = ListNode(0)
        var resultNode = dummyHead
        
        var p = l1
        var q = l2
        var carry : Int = 0
        
        while(p != null || q != null){
            
            var x = if(p != null) p?.`val` else 0
            var y = if(q != null) q?.`val` else 0
            
            var sum = carry + x+ y
            carry = sum / 10
            resultNode.next = ListNode(sum % 10)
            resultNode = resultNode.next
            
            if(p!=null){
                p = p.next
            }
            if(q != null){
                q = q.next
            }
        }
        
        if(carry > 0){
            resultNode.next = ListNode(carry)
        }
        
        return dummyHead.next
        
    }
}