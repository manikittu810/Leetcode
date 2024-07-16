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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    private static TreeNode helper(int[] nums,int l,int h){
        if(l>h){
            return null;
        }

        int mid = (l+h)/2;
        TreeNode newRoot = new TreeNode(nums[mid]);

        newRoot.left = helper(nums,l,mid-1);
        newRoot.right = helper(nums,mid+1,h);

        return newRoot;
    }
}