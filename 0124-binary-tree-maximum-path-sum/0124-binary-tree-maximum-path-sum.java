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
    private int max_sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper (root);
        return max_sum;
    }
    private int helper(TreeNode root){
        if(root == null){return 0;}

        int ls = Math.max(helper(root.left),0);
        int rs = Math.max(helper(root.right),0);
        int cur_sum = ls+rs+root.val;
        max_sum = Math.max(max_sum, cur_sum);
        return root.val+Math.max(ls,rs);

    }
}