class LRUCache {

	class ListNode{
		int key,val;
		ListNode prev,next;
		ListNode(int key,int val){
			this.key = key;
			this.val = val;
			}
	}

	private Map<Integer,ListNode>map;
	private int capacity;
	private ListNode head,tail;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new ListNode(0,0);
        tail = new ListNode(0,0);
	head.next = tail;
	tail.prev = head;
	this.capacity = capacity;
    }
    
    public int get(int key) {
     if(map.containsKey(key)){
    	ListNode node = map.get(key);
	removeNode(node);
	addToHead(node);
	return node.val;
     }    else{
		return -1;
	}
    }
	public void removeNode(ListNode node){
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
	public void addToHead(ListNode node){
		node.next = head.next;
		node.next.prev = node;
		head.next = node;
		node.prev = head;
	}
	public ListNode removeAtTail(){
		ListNode lru = tail.prev;
		removeNode(lru);
		return lru;
	}
    
    public void put(int key, int value) {
	if(!map.containsKey(key)){
        if(map.size() == capacity){
            ListNode node = removeAtTail();
            map.remove(node.key);
        }
	ListNode newNode = new ListNode(key,value);
	addToHead(newNode);
	map.put(key,newNode);
	}else{
	 ListNode node = map.get(key);
	 removeNode(node);
	 node.val = value;
	 addToHead(node);
	 map.put(key,node);	
	}
   }
}
