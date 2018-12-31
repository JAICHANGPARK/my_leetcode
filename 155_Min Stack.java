class MinStack {
    /*
    0 [1,2,3,4,0] min : 0
    4 [1,2,3,4] min : 1
    3 [1,2,3] min : 1
    2 [1,2] min : 1
    1 [1] min : 1
    
    */
    
    class Node{
        int val, min;
        Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
    
    Stack<Node> s = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        Node node =null;
        if(s.isEmpty()){
            node = new Node(x,x);
        }else{
            //스택에 무언가 들어있을때 비교하는 부분 
            node = new Node(x, (x < s.peek().min) ? x : s.peek().min);
        }
        s.push(node);
        
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().val;
    }
    
    public int getMin() {
        return s.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
