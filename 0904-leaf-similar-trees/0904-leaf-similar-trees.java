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
        return helper(root1).equals(helper(root2));
    }
    private List<Integer> helper(TreeNode root){
        List<Integer> l = new ArrayList<>();

        if(root == null){
            return null;
        }
        Stack<TreeNode> s= new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode cur = s.pop();
            if(cur.left==null && cur.right ==null){
                l.add(cur.val);
            }
            if(cur.right!=null){
                s.push(cur.right);
            }
            if(cur.left != null){
                s.push(cur.left);
            }
        }
        return l;
    }    
}