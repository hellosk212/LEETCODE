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
    public boolean isSymmetric(TreeNode root) {
    if(root==null) return true;
    return Helper(root.left,root.right);
}
    
    public boolean Helper(TreeNode r, TreeNode l) {
    if(r==null && l==null) return true;
    if(r==null || l==null) return false;
    return (r.val==l.val) && Helper(r.left,l.right) && Helper(r.right,l.left);

        
    }
}