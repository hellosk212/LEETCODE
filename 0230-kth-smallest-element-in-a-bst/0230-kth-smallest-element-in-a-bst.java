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
  public int kthSmallest(TreeNode root, int k) {
        return solution(root,new int[]{k});
    }
    
    private int solution(TreeNode root, int[] k) {
        if(root==null) {
            return -1;
        }
        int res = solution(root.left,k);
        if(res!=-1) {
            return res;
        }
        if(k[0]==1) {
            return root.val;
        }
        k[0]--;
        return solution(root.right,k);
    }
}