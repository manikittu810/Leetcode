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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        List<Integer> l = new ArrayList<>();
        helper(root,l);
        for(int i=1;i<l.size();i++){
            if(!l.get(i-1).equals(l.get(i))){
                return false;
            }
        }
        return true;
    }
    private void helper(TreeNode root,List<Integer> l){
        if(root == null)
        {
            return ;
        }
        l.add(root.val);
        helper(root.left,l);
        helper(root.right,l);
    }
}