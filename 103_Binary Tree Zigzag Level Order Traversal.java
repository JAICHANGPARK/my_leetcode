/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // 레벨 별 스택 사용
    // 플래그 변수 사용
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
                List<List<Integer>> ret = new ArrayList<>();
        if(root == null) return ret;
        
        boolean flag = true;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        
        while(!s.isEmpty()){
            
            int size= s.size();
            Stack<TreeNode> newStack = new Stack<>();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i< size; i++){
                //자손처리        
                TreeNode node = s.pop();
                level.add(node.val);
                
                 if(flag){
                    if(node.left != null) newStack.push(node.left);
                    if(node.right != null) newStack.push(node.right);
                }else{

                    if(node.right != null) newStack.push(node.right);
                    if(node.left != null) newStack.push(node.left);
                }
            }
           
            ret.add(level);
            s = newStack; // 스택을 바꿔주는거?
            flag = !flag;
        }
     
        return ret;
    }
}
