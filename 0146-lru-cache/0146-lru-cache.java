class LRUCache {
    class Node{
        int key, value;
        Node prev,next;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private Map<Integer,Node> map;
    private Node head,tail;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        removeNode(node);
        addToHead(node);
        return node.value;
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
        if(!map.containsKey(key)){
            if(map.size() == capacity){
                Node node = removeAtTail();
                map.remove(node.key);
            }
            Node node = new Node(key,value);
            addToHead(node);
            map.put(key,node);
        }else{
            Node node = map.get(key);
            removeNode(node);
            node.value = value;
            addToHead(node);
            map.put(key,node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */