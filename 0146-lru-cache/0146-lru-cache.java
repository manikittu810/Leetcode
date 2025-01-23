class LRUCache {

    class Node{
            int key,val;
            Node prev,next;
            Node(int key,int val){
                this.key = key;
                this.val = val;
            }
        }
        private Node head;
        private Node tail;
        private Map<Integer,Node> map;
        private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {

        Node node = map.get(key);

        if(node == null){
            return -1;
        }

        removeNode(node);

        addAtHead(node);

        return node.val;
    }
    
    public void put(int key, int value) {

       if(map.containsKey(key)){

        Node node = map.get(key);
        node.val = value;

        removeNode(node);

        addAtHead(node);

       }else{

        if(map.size()==capacity){

            Node lru = removeAtTail();
            map.remove(lru.key);
        }

       Node newNode  = new Node(key,value);
       addAtHead(newNode);
       map.put(key,newNode);
       }
    }

    public void addAtHead(Node node){
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    public Node removeAtTail(){
        Node lru = tail.prev;
        removeNode(lru);
        return lru;
    }
    public void removeNode(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */