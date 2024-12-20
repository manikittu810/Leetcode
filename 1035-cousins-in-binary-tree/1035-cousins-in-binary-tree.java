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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }
        Queue<TreeNode> q = new LinkedList<>();
        int countChildrenAtLevel =0;
        q.offer(root);

        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode parent = q.poll();
                int isSameParent = 0;
                    if(parent.left!=null){
                        if(parent.left.val == x || parent.left.val == y){
                            countChildrenAtLevel++;
                            isSameParent++;
                        }
                        q.offer(parent.left);
                    }
                    if(parent.right!=null){
                        if(parent.right.val == x || parent.right.val == y){
                            countChildrenAtLevel++;
                            isSameParent++;
                        }
                        q.offer(parent.right);
                    }
                    if(isSameParent == 2){
                        return false;
                    }
            }
            if(countChildrenAtLevel == 2){
                return true;
            }
            if(countChildrenAtLevel ==1){
                return false;
            }
        }return false;
    }
}