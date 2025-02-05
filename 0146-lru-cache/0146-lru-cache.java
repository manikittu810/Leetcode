class LRUCache {

    class Node{
        int key,val;
        Node prev,next;
        Node(int key,int val){
            this.val = val;
            this.key = key;
        }
    }

    private Node head,tail;
    private final int capacity;
    Map<Integer,Node> map;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if(node == null){
            return -1;
        }
        removeNode(node);
        addToHead(node);
        return node.val;
        
    }
    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void addToHead(Node node){
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    public Node removeAtTail(){
        Node node = tail.prev;
        removeNode(node);
        return node;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            removeNode(node);
            addToHead(node);
            // how to insert this back into map
        }else{
            if(capacity == map.size()){
                Node node = removeAtTail();
                map.remove(node.key);
            }
            Node newNode = new Node(key,value);
            map.put(key,newNode);
            addToHead(newNode);
        }
       
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */