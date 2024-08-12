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
    public boolean evaluateTree(TreeNode root) {
        if(root == null){return true;}
        return helper(root);
        
    }
    private boolean helper(TreeNode root){
        if(root.left == null && root.right == null){
            return root.val ==1;
        }

            boolean res1 = evaluateTree(root.left);
            boolean res2 =  evaluateTree(root.right);
        if(root.val == 2){
            return res1 || res2;
        }
        else if(root.val == 3 ){
            return res1 && res2;
        }
        else{
            throw new IllegalArgumentException("Invalid node value");
        }
        }
    }