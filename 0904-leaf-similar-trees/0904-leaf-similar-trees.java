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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1 == null && root2 == null){
            return true;
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        helper(root1,l1);//n
        helper(root2,l2);//n
        if(l1.size()!=l2.size()){
            return false;
        }
        else{//n
            for(int i=0;i<l1.size();i++){
                if(!l1.get(i).equals(l2.get(i))){
                    return false;
                }
            }
            return true;
        }

    }
    private void helper(TreeNode root,List<Integer> l){
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null){
            l.add(root.val);
            return;
        }
        helper(root.left,l);
        helper(root.right,l);
    }
}

