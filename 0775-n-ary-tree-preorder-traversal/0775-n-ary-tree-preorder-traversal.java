/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> allChildren = new ArrayList<>();
        if(root ==null){
            return allChildren;
        }
        helper(root,allChildren);
        return allChildren;
    }
    private void helper(Node root, List<Integer> allChildren){
        if(root == null){
            return ;
        }
        allChildren.add(root.val);
        for(Node child : root.children){
            helper(child,allChildren);
        }
    }
}