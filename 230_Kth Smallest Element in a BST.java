/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
in l self r 
pre 
*/
class Solution {
    int k;
    int i;
    int ret;
    
    public int kthSmallest(TreeNode root, int k) {
        this.k =k;
        i = 0; 
        traverse(root);
        return ret;
    }
    
    public void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.left);
        //self
        if(++i == k){
            ret = root.val;    
        }
        traverse(root.right);
    }
        
}
