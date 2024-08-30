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
    Map<Integer,Integer> map = new HashMap<>();
    private int preOrderIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
if(preorder.length<1 || inorder.length<1){
    return null;
}    
for(int i=0;i<inorder.length;i++){
    map.put(inorder[i],i);
}
return preOrder(preorder,0,inorder.length-1);
}
    private TreeNode preOrder(int[]a,int startIdx,int endIdx){
        if(preOrderIndex > a.length-1 || startIdx>endIdx){return null;}

        int curVal = a[preOrderIndex++];
        TreeNode root = new TreeNode(curVal);

        int mid = map.get(curVal);

        root.left = preOrder(a,startIdx,mid-1);
        root.right = preOrder(a,mid+1,endIdx);
        return root;
    }

}