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
    int preIndex = 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return buildTree(preorder,postorder,0,postorder.length-1);
    }
    private TreeNode buildTree(int[]preOrder,int[]postOrder, int postStart,int postEnd){
        if(postStart > postEnd){ return null;}

        TreeNode root = new TreeNode(preOrder[preIndex++]);

        if(postStart == postEnd){
            return root;
        }

        int leftRootVal = preOrder[preIndex];
        int leftRootIndexInPostOrder = postStart;

        while(postOrder[leftRootIndexInPostOrder] != leftRootVal){
            leftRootIndexInPostOrder++;
        }

        root.left = buildTree(preOrder,postOrder,postStart,leftRootIndexInPostOrder);
        root.right = buildTree(preOrder,postOrder,leftRootIndexInPostOrder+1, postEnd-1);

        return root;

    }
}