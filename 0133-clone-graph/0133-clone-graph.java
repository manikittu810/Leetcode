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

        Queue<Node> q = new LinkedList<>();
        Map<Node,Node> visited = new HashMap<>();

        q.offer(node);

        Node clonedNode = new Node(node.val,new ArrayList<>());
        visited.put(node,clonedNode);
    
        while(!q.isEmpty()){

            Node currentNode = q.poll();

            for(Node u : currentNode.neighbors){
                if(!visited.containsKey(u)){
                    Node currentNeighbor = new Node(u.val,new ArrayList<>());
                    q.offer(u);
                    visited.put(u,currentNeighbor);
                }
                visited.get(currentNode).neighbors.add(visited.get(u));
            }
        }
        return clonedNode;
    }
}