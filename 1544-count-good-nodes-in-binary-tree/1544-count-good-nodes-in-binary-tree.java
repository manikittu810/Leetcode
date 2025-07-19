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
    private int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        int maxValue = Integer.MIN_VALUE;
        dfs(root,maxValue);
        return count;
    }
    private void dfs(TreeNode root, int maxValue){
        if(root == null){
            return ;
        }

        if(root.val>=maxValue){
            count+=1;
            maxValue = root.val;
        }
        dfs(root.left,maxValue);
        dfs(root.right,maxValue);
    }
}