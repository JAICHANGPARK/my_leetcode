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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, false, false, 0,0);
    }
    
     public boolean isValidBST(TreeNode root,
                              boolean lbe, boolean ube, int lb, int ub) {
         
         if(root == null) return true;
         
         if(lbe && root.val <= lb){
             return false;
         }
         
         if(ube && root.val >= ub){
             return false;
         }
            
             
        return isValidBST(root.left, lbe, true, lb, root.val)
             && isValidBST(root.right, true, ube, root.val, ub);
        
    }
}
