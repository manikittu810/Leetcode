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
    private int c ;
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        c = 0;
        helper(root,Integer.MIN_VALUE);
        return c;
    }
    private void helper(TreeNode root, int maxVal){
        if(root == null){
            return ;
        }
        if(root.val>= maxVal){
            c++;
            maxVal = root.val;
        }
        helper(root.left,maxVal);
        helper(root.right,maxVal);

    }
}