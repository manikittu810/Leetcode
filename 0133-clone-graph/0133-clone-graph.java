/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        Map<Node,Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        Node clonedStartNode = new Node(node.val,new ArrayList<>());
        map.put(node,clonedStartNode);
        q.offer(node);
        while(!q.isEmpty()){
            Node nodeToBeExplored = q.poll();
            for(Node u : nodeToBeExplored.neighbors){
                if(!map.containsKey(u)){
                Node newNode = new Node(u.val,new ArrayList<>());
                map.put(u,newNode);
                q.offer(u);
                }
                map.get(nodeToBeExplored).neighbors.add(map.get(u));
            }
        }
        return clonedStartNode;
    }
}