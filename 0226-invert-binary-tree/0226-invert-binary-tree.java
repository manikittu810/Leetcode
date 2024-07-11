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
    public TreeNode invertTree(TreeNode root) {
        return isMirror(root);
       
    }
private  static TreeNode isMirror(TreeNode root){
    if(root == null){
        return null;
    }
    TreeNode leftST = isMirror(root.left);
    TreeNode rightST = isMirror(root.right);
    root.left = rightST;
    root.right = leftST;
    return root;
}
}