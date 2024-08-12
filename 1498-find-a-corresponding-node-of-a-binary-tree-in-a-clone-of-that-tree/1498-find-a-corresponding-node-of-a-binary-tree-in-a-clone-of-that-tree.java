/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Deque<TreeNode> r1 = new ArrayDeque<>();
        Deque<TreeNode> r2 = new ArrayDeque<>();

        r1.offer(original);
        r2.offer(cloned);

        while(!r1.isEmpty()){
            TreeNode o = r1.poll();
            TreeNode c = r2.poll();

            if(o == target){
                return c;
            }

            if(o.left!=null){
                r1.offer(o.left);
                r2.offer(c.left);
            }
            if(o.right!=null){
                r1.offer(o.right);
                r2.offer(c.right);
            }
        }
        return null;
    }
}