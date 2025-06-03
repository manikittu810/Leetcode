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
        Node firstClonedNode = new Node(node.val,new ArrayList<>());
        map.put(node,firstClonedNode);
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            Node originalNode = q.poll();
            for(Node u : originalNode.neighbors){
                if(!map.containsKey(u)){
                    Node copyOfU = new Node(u.val, new ArrayList<>());
                    map.put(u,copyOfU);
                    q.offer(u);
                }
                map.get(originalNode).neighbors.add(map.get(u));
            }
        }
        return firstClonedNode;
    }
}