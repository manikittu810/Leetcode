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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l =new ArrayList<>();
        if(root == null){
            return l;
        }
        
         helper(root,new StringBuilder(),l);
        return l;
         
    }
    private void helper(TreeNode root,StringBuilder sb, List<String> l){
        if(root == null){
            return;
        }
        int len = sb.length();
        if(len!=0){
            sb.append("->");
        }
        sb.append(root.val);
        if(root.left == null && root.right == null){
            l.add(sb.toString());
        }
        else {
           if(root.left!=null){
            helper(root.left,sb,l);
           }
           if(root.right!=null){
            helper(root.right,sb,l);
           }
        }
     sb.setLength(len);
    }
}