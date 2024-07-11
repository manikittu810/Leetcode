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
    TreeNode temp = leftST;
    TreeNode rightST = isMirror(root.right);
    root.left = root.right;
    root.right = temp;
    return root;
}
}