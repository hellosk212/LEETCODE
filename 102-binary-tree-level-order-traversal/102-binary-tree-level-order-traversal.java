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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        if(root==null) return ans;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.offer(null);
        
        ArrayList<Integer> curList = new ArrayList<>();
        
        while(!q.isEmpty()){
            TreeNode cur =q.poll();
            if(cur==null){
                ans.add(curList);
                if(q.isEmpty()) return ans;
                q.offer(null);
                curList =new ArrayList<>();
                
                
                }else{
                curList.add(cur.val);
                
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
            
        }
        
        return ans;
        
        
    }
}