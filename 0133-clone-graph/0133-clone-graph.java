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
        map.put(node,new Node(node.val));
        Queue<Node> q = new LinkedList<>();

        q.offer(node);

        while(!q.isEmpty()){

            Node cur = q.poll();

            for(Node u : cur.neighbors){

            if(!map.containsKey(u)){

                map.put(u,new Node(u.val));

                q.offer(u);
            }

            map.get(cur).neighbors.add(map.get(u));
            
        }
        }
        return map.get(node);
    }
}