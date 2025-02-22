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
    public TreeNode recoverFromPreorder(String s) {
        Stack<TreeNode> st = new Stack<>();
        int index = 0;
        while(index < s.length()){
            int depth = 0;
            while(index<s.length() && s.charAt(index)=='-'){
                index++;
                depth++;
            }
            int val = 0;
            while(index<s.length() && Character.isDigit(s.charAt(index))){
                val = val*10 + (s.charAt(index)-'0');
                index++;
            }
            TreeNode node = new TreeNode(val);

            while(st.size()>depth){
                st.pop();
            }

            if(!st.isEmpty()){
                if(st.peek().left == null){
                    st.peek().left = node;
                }else{
                    st.peek().right = node;
                }
            }

            st.push(node);

        }
        while(st.size()>1){
            st.pop();
        }
        return st.peek();
    }
}