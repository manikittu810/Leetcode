class LRUCache {
    class ListNode{
        int key,val;
        ListNode prev,next;
        ListNode(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
    private int capacity;
    private Map<Integer,ListNode> map;
    private ListNode head;
    private ListNode tail;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new ListNode(0,0);
        tail = new ListNode(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        ListNode node = map.get(key);
        if(node == null){
            return -1;
        }
        removeNode(node);
        addAtHead(node);
        return node.val;
    }
    public void removeNode(ListNode node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    public void addAtHead(ListNode node){
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            ListNode node = map.get(key);
            node.val = value;            
            removeNode(node);
            addAtHead(node);
        }else{
            if(map.size()== capacity){
                ListNode lru = removeAtTail();
                map.remove(lru.key);
            }
            ListNode node = new ListNode(key,value);
            addAtHead(node);
            map.put(key,node);
        }
        
    }
    private ListNode removeAtTail(){
        ListNode lru = tail.prev;
        removeNode(lru);
        return lru;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */