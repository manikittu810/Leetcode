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
        Map<Node,Node> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        Node clonedStart = new Node(node.val,new ArrayList<>());
        visited.put(node,clonedStart);
        q.offer(node);
        while(!q.isEmpty()){
            Node currentNodeToBeExplored = q.poll();
            for(Node u : currentNodeToBeExplored.neighbors){
                if(!visited.containsKey(u)){
                    Node clonedNeighborU = new Node(u.val,new ArrayList<>());
                    visited.put(u,clonedNeighborU);
                    q.offer(u);
                }
                visited.get(currentNodeToBeExplored).neighbors.add(visited.get(u));
            }
        }
return clonedStart;
    }
}