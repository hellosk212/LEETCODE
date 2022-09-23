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
    public TreeNode insertIntoBST(TreeNode root, int key) {
        
        //Iteative
        
        TreeNode par=null,cur=root;
       
        
        while(cur!=null){
            
            if(key>cur.val){
                
                
                par=cur;
                cur=cur.right;
            }
            else if(key<cur.val){
                par=cur;cur=cur.left;
}
        }
        TreeNode newNode=new TreeNode(key);
        if(par==null)return newNode;
        
        if(key>par.val){
            par.right=newNode;
            
}
        else if(key<par.val){

        par.left=newNode;
        

                

        }
        return root; 
        }
        
         }
