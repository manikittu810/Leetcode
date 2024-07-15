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
    Integer sum = 0;
    public int rangeSumBST(TreeNode root, int l, int h) {
       
            if(root == null){
            return 0;
        }
        if(root.val < l){
            rangeSumBST(root.right,l,h);
        }
        if(root.val>=l && root.val <= h){
            sum+=root.val;
            rangeSumBST(root.left,l,h);
            rangeSumBST(root.right,l,h);
        }
        if(root.val>h){
            rangeSumBST(root.left,l,h);
        }
        return sum;
    }
}