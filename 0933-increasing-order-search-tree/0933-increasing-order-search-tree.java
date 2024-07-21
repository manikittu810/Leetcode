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
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> l =new ArrayList<>();
        inorder(root,l);
        return buildTree(l);
    }
    public void inorder(TreeNode root, List<TreeNode> l){
        if(root == null){
            return ;
        }
        inorder(root.left,l);
        l.add(root);
        inorder(root.right,l);
    }
    public TreeNode buildTree(List<TreeNode> l){
        TreeNode temp = new TreeNode(0);
        TreeNode root = temp;
        for(TreeNode cur : l){
            cur.left = null;
            root.right = cur;
            root = root.right;
        }
        return temp.right;
    }
}