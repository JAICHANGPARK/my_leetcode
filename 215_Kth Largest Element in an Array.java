class Solution {
    
    // 우선순위 자료구조 
    // 뽑아 낼때 나오는 숫자는 가장 작은게 나온다.
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    public int findKthLargest(int[] nums, int k) {
        
        /*
        1. 큐에 k개 원소보관
        2. 이제껏 본 원소중 가장 큰 k
        3. 큐의 맨 앞에는 k 개중 가장 작은것이 있다.
        */
        
        for(int num: nums){
            if(pq.size() < k){
                pq.offer(num);
            }else{
                if(num > pq.peek()){ //peek은 정렬된 상태의 가장 앞의 값만 나옴, => 가장 낮은 값만 나오게 됨.
                    pq.poll(); // 나올때 정렬되어 작은 수 부터 나옴 
                    pq.offer(num);
                }
            }
        }
        
        return pq.peek();
        
    }
}
