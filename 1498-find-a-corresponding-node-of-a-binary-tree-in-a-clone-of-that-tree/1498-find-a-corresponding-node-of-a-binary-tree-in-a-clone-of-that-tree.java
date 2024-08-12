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
        //DFS Iterative Inorder traversal Implementation
        Deque<TreeNode> r1 = new ArrayDeque<>();
        Deque<TreeNode> r2 = new ArrayDeque<>();
        TreeNode o  = original,c =cloned;

        r1.add(o);
        r2.add(c);   
        while(o!=null || !r1.isEmpty()){
            while(o!=null){
                r1.add(o);
                r2.add(c);
                o=o.left;
                c=c.left;
            }
            o =r1.removeLast();
            c = r2.removeLast();

            if(o == target){
                return c;
            }

            o = o.right;
            c = c.right;
        }     
        return null;
    }
}