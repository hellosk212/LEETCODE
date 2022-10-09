/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
       /* if(root==null) return true;
        
        if(root.left!=null && root.left.val>root.val) &&
            if(root.right!=null && root.right.val<root.val) return false;
        
        
        return isValidBST(root.left) && isValidBST(root.right);
        */
        
        return isValidBST(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root,long minvalue,long maxvalue){
        
         if(root==null) return true;
        
         if(root.val<=minvalue || root.val>=maxvalue) return false;
        
        return isValidBST(root.left,minvalue,root.val) &&isValidBST(root.right,root.val,maxvalue);
         
        
    }
    
}