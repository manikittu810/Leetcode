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
    public List<List<Integer>> levelOrder(TreeNode root) {
        

        List<List<Integer>> l = new ArrayList<>();
        if(root == null){
            return l;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){

            List<Integer> l1 = new ArrayList<>();

            int n = q.size();

            for(int i=0;i<n;i++){

            TreeNode cur = q.poll();

            l1.add(cur.val);

            if(cur.left!=null){
                q.offer(cur.left);
            }

            if(cur.right != null){
                q.offer(cur.right);
            }

            }
            l.add(l1);
        }
        return l;
    }
}