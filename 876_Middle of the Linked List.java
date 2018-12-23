/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        
        while( runner != null){
            runner = runner.next;
            if(runner != null){
                walker = walker.next;
                runner = runner.next;
            }
        }
        return walker;
    }
}
