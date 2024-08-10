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
    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        if(root == null){
            return -1;
        } 

        int n1=0,n2 =0;

        helper(root,minHeap);

        if(minHeap.size()>=2){
            n1 = minHeap.poll();
             n2 = minHeap.poll();
        }
        
        else{
             return -1;
        }
        return n2;
    }


    public void helper(TreeNode root,
    PriorityQueue<Integer> minHeap){
        
        if(root == null){
            return;
        }

        if(!minHeap.contains(root.val)){
            minHeap.offer(root.val);
        }

         helper(root.left,minHeap);
         helper(root.right,minHeap);
    }
}