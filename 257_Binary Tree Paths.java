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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<>();
        String path = null;
        if(root == null) return ret;
        path = Integer.toString(root.val);
        traverse(root, ret, path);
        
        return ret;
    }
    
    public void traverse(TreeNode root, List<String> ret, String path){
            //base call
        if(root == null) return;
        
        //self
        if(root.left == null && root.right == null) ret.add(path);
        //left
        if(root.left != null) traverse(root.left, ret, path + "->" + Integer.toString(root.left.val));
        //right
        if(root.right != null) traverse(root.right, ret, path + "->" + Integer.toString(root.right.val));
        
    }
}
