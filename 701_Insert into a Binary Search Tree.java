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
    public TreeNode insertIntoBST(TreeNode root, int val) {
    if(root == null){
        return new TreeNode(val);
     }
        
     TreeNode child = null;
        
     if(val > root.val){
         child = insertIntoBST(root.right, val);
         root.right = child;
     } else {
         child = insertIntoBST(root.left, val);
         root.left = child;
     }
      
     return root; 
        
    }
}
