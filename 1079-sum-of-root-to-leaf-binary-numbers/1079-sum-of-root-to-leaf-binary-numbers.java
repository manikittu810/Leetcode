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
    public int sumRootToLeaf(TreeNode root) {
        if(root == null){
            return 0;
        }
        return buildInteger(root,new StringBuilder(),0);
       
    }
    private int buildInteger(TreeNode root,StringBuilder sb,int sum){
        if(root == null){return 0;}
        sb.append(root.val);
        if(root.left == null && root.right == null){
            String s = sb.toString();
            int n = Integer.parseInt(s,2);
            sum+=n;
        }
        else{
            sum+=buildInteger(root.left,sb,0);
            sum+=buildInteger(root.right,sb,0);
        }
        sb.deleteCharAt(sb.length()-1);
        return sum;
    }
}