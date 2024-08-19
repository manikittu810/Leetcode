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
    private int ans,x;
    public int kthSmallest(TreeNode root, int k) {
        x=k;
         dfs(root);
         return ans;
    }
    private void dfs(TreeNode root){
        if(root == null){
            return ;
        }
        dfs(root.left);
        x--;
        if(x==0){ans = root.val;}
        dfs(root.right);
    }
}