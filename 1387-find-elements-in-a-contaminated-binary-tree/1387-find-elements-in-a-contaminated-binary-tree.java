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
class FindElements {
    private TreeNode root;
    private Set<Integer> set;

    public FindElements(TreeNode root) {
        this.root = root;
        this.set = new HashSet<>();
        constructTree(root,0);
    }
    public void constructTree(TreeNode root,int value){
        if(root== null){
            return ;
        }
        root.val = value;
        set.add(value);
        constructTree(root.left,2*value+1);
        constructTree(root.right,2*value+2);
    }
    
    public boolean find(int target) {
        return set.contains(target);
        
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */