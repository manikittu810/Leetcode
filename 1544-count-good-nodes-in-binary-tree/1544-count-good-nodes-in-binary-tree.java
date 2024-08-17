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
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        return helper(root,root.val);
    }
    private int helper(TreeNode root,int maxVal){
        if(root == null){
            return 0;
        }
        int count =0;
        if(root.val >= maxVal){
            count = 1;
            maxVal = root.val;
        }
        count+=  helper(root.left,maxVal);
        count+= helper(root.right,maxVal);
        return count;
    }
}