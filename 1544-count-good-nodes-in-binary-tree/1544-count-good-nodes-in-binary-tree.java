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
    count =0;
    int maxVal = Integer.MIN_VALUE;
    helper(root,maxVal);
        return count;
    }
    private void helper(TreeNode root,int maxVal){
        if(root ==null){
            return ;
        }
        if(root.val >=maxVal){
            count+=1;
            maxVal = root.val;
        }
        helper(root.left,maxVal);
        helper(root.right,maxVal);

    }
}