class Solution {
    public Node copyRandomList(Node head) {
	Map<Node,Node> map = new HashMap<>();
	for(Node cur = head;cur!=null; cur = cur.next){
		Node newNode = new Node(cur.val);
		map.put(cur,newNode);
	}        
	
	for(Node cur = head; cur!=null ; cur = cur.next){
		Node newNode = map.get(cur);
		newNode.next = map.get(cur.next);
		newNode.random = map.get(cur.random);
	}
return map.get(head);
    }
}
