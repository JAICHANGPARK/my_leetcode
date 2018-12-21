/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); 
        ListNode l3 = dummy;
        int carry = 0;
        
        while(l1 != null && l2 != null){
            int digitValue = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            ListNode newNode = new ListNode(digitValue);
            l3.next = newNode;
            l3 = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int digitValue = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            ListNode newNode = new ListNode(digitValue);
            l3.next = newNode;
            l3 = newNode;
            l1 = l1.next;
        
        }
        while(l2 != null){
            int digitValue = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            ListNode newNode = new ListNode(digitValue);
            l3.next = newNode;
            l3 = newNode;
            l2 = l2.next;
        
        }
        // 2 + 9 = 11
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;
            l3 = newNode;
            
        }
        return dummy.next;
    }
}