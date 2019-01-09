// 두개의 솔루션 중 하나 선택
// 둘다 Accept 잘됨 

class Solution {
    public int reverse(int x) {
        boolean sign = x > 0;
        x = Math.abs(x);
        int res =0;
        while(x > 0){
            if(res > Integer.MAX_VALUE / 10) return 0;
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return sign ? res : -res;
    }
}

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
