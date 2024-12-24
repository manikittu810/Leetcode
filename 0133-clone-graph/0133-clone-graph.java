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
        //track visited nodes and their clones.
        Map<Node,Node> visited = new HashMap<>();

        //initialize the queue and add the startting node;

        Queue<Node> q = new LinkedList<>();

        q.offer(node);

        Node clone = new Node(node.val,new ArrayList<>());
        visited.put(node,clone);

        while(!q.isEmpty()){
            Node current = q.poll();
            for(Node u : current.neighbors){
                if(!visited.containsKey(u)){
                    Node cloneTheNeighbor = new Node(u.val,new ArrayList<>());
                    visited.put(u,cloneTheNeighbor);
                    q.offer(u);
                }
                visited.get(current).neighbors.add(visited.get(u));
            }
        }
return clone;
    }
}