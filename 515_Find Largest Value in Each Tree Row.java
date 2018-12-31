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
    
    //Tree BFS
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) return ret;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i<size; i++){
                //레벨별 값 찾기 
                TreeNode node = q.poll();
                if(node.val > max) max = node.val;             
               
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            ret.add(max);    
        }
        
        return ret;
        
    }
}
