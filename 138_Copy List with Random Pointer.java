/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;
        
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode newHead = new RandomListNode(head.label); //return
        RandomListNode cur = newHead; // copy
        
        map.put(head, newHead);
        
        while(head != null){
            if(head.next != null){
                if(!map.containsKey(head.next)){
                    map.put(head.next, new RandomListNode(head.next.label));
                }
                cur.next = map.get(head.next); // 복사 뜨는 링크드리스트의 포인터 
            }
            
            if(head.random != null){
                if(!map.containsKey(head.random)){
                    map.put(head.random, new RandomListNode(head.random.label));
                }
                cur.random = map.get(head.random); // 복사 뜨는 링크드리스트의 포인터 
            }
            
            head = head.next;
            cur = cur.next;
        }
        
        return newHead;
    
    }
    
}
