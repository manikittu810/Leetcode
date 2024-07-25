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
    private  int t = 0;
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
            helper(root);
            return t;
    }
    private int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int ls = helper(root.left);
        int rs = helper(root.right);
        int v = Math.abs(ls-rs);
        t+=v;
        return ls+rs+root.val;
    }
}