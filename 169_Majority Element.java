class Solution {
    
    /*
    1. HashMap<Integer, Integer> label, count
    2. loop statement
    3. algorithm
    */
    public int majorityElement(int[] nums) {
        int x = 0, cnt = 0;
        for (int num:nums){
            if(cnt == 0){
                x=num;
                cnt++;
            }else if(x == num){
                cnt++;
            }else{
                cnt--;
            }
        }
        return x;
    }
}
