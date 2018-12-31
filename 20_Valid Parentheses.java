class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            
            if(c =='(' || c == '{' || c =='['){
                stk.push(c);
            }
            else if( c == ')'){
                if(stk.size() == 0 || stk.pop() != '('){
                    return false;
                }
            }
            else if( c == '}'){
                if(stk.size() == 0 ||stk.pop() != '{'){
                    return false;
                }
            }
            else if( c == ']'){
                if(stk.size() == 0 || stk.pop() != '['){
                    return false;
                }
            }else{
                return false;
            }
        }
        return stk.size() == 0;
        
    }
}
