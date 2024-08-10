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
    public int findSecondMinimumValue(TreeNode root) {
       Set<Integer> s = new HashSet<>();
       helper(root,s);
       int []a = new int[s.size()];
       int idx = 0;
       for(int n  : s){
        a[idx++] = n;
       }
       Arrays.sort(a);
       if(a.length==1){
        return -1;
       }
        return a[1];
    }
    private void helper(TreeNode root, Set<Integer> s){
        if(root == null){
            return ;
        }
        s.add(root.val);

        helper(root.left,s);
        helper(root.right,s);
    }
}