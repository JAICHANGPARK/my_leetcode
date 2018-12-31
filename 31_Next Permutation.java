class Solution {
    public void nextPermutation(int[] nums) {
        //뒤에서 탐색하면서 오름차운이 깨지는 인덱스를 확인
        // 다위 뒤에서부터 탐색하면서 a보다 큰 첫번째 인덱스를 확인
        // a랑 b를 스왑
        // a + 1에서부터 끝까지를 오름차순으로 정렬
        
        int a = nums.length -2;
        while( a >= 0 && nums[a] >= nums[a+1]) a--;
        
        if(a!= -1){
            int b = nums.length -1;
            while(nums[a] >= nums[b]) b--;
            swap(nums,a,b);
        }
        
        int start = a+1;
        int end = nums.length -1;
        while(start < end){
            swap(nums, start++, end--);
        }
        
    }
    
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
