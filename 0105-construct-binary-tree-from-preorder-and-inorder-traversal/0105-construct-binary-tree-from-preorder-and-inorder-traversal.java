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
    private int preOrderIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return preOrder(preorder,inorder,0,inorder.length-1);
    }
    private TreeNode preOrder(int[]a,int[]b,int startIdx,int endIdx){
        if(startIdx>endIdx){return null;}
        TreeNode root = new TreeNode(a[preOrderIndex++]);

        int inorderIndexOfRoot = startIdx;

        for(int i=startIdx;i<=endIdx;i++){
            if(b[i] == root.val){
                inorderIndexOfRoot = i;
                break;
            }
        }

        root.left = preOrder(a,b,startIdx,inorderIndexOfRoot-1);
        root.right = preOrder(a,b,inorderIndexOfRoot+1,endIdx);
        return root;
    }

}