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
    public boolean findTarget(TreeNode root, int k) {
       Map<Integer,Integer> map = new HashMap<>();
        return search(root,k,map);

    }
    public boolean search(TreeNode root,int k,Map<Integer,Integer> map ){
        if(root == null){
            return false;
        }
        
        
        if(!map.containsKey(k-root.val)){
            map.put(root.val,1);
        }
        else{
            return true;
        }
        return search(root.left,k,map) || 
        search(root.right,k,map);

    }
}