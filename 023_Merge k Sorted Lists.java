/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        
        ListNode ret = null;
        ListNode cur = null;
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length,
                                                        (a,b) -> a.val - b.val); // 오름차순
        //내림차순 (a,b)-> b.val - a.val
    
        for(ListNode node: lists){
            if(node == null)continue;
            pq.offer(node);
        }
        
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            if(node.next!= null) pq.offer(node.next);
            
            if(ret == null){
            
                ret = node;
                cur = node;
                
            }
            
            else{
                
                cur.next = node;
                cur = node;
            }
        }
        return ret;
    }
}
