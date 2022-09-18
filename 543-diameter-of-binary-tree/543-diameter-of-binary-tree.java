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


//In ths Q we are calculatng diameter by edges not by nodes
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null) return 0;
        
        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);
        
        
        int lh=height(root.left);
        int rh=height(root.right);
        
        int cur=lh+rh;
        
        return Math.max(cur,Math.max(ld,rd));          
        
    }
    int height(TreeNode root){
        
        if(root==null) return 0;
        
        int lh=height(root.left);
        int rh=height(root.right);
        
        return Math.max(lh,rh)+1;
        
        
    }
}