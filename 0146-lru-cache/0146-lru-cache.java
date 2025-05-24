class LRUCache {

    class Node{
        Node prev; // need something to hold the prev node in a double LL
        Node next; //need something top hold the next node in a dll
        int key ; // node's key
        int value; // node's value

        Node(int key , int value){ //node constructor
            this.key = key; // assigning current key  to the key variablen from object creation
            this.value = value; // assigning current value to the value variable from the object creation

        }
    }
   private Map<Integer,Node> map; // initializing the HashMap as needed
    private Node head; // dll requires a head and a tail
    private Node tail;
    private int capacity; // declare a capacity variable


    public LRUCache(int capacity) { //Class constructor
        map = new HashMap<>(); //Hashmap initialization
        head = new Node(0,0); // creating a head node
        tail = new Node(0,0); // creating a tail node
        head.next = tail; // connecting the head and tail
        tail.prev = head;
        this.capacity = capacity; // assigning the capacity value  to the capacity varaible from the object creation
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1; //if not found returning -1
        }else{ // checking if the map contains the key
            //remove from list 
            Node node = map.get(key);// you get node here
            removeNode(node); //removing the node from list
            //add to head
            addNodeAtHead(node); //adding at head
            return node.value;//returnin node value
        }
    }
    public void removeNode(Node node){
        node.prev.next = node.next;//removing the prev link
        node.next.prev = node.prev;//removing the next link
    }
    public void addNodeAtHead(Node node){
        node.next = head.next; // new node's next == head's next;
        node.next.prev = node;// node's next node's prev is node
        head.next = node;//head's next node is new Node -> here now heading is holding the new node
        node.prev = head; // node' previous node is head node
    }

    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key); // node is holding the value of the key .
            removeNode(node);// removed the node the list 
            node.value = value; // updated the value 
            addNodeAtHead(node);// added back to the list right next to the head
            map.put(key,node);// again putting back the updated  node into the hashmap.
        }else{
            if(map.size() == capacity){
                // remove the node from the end of the LinkedList which is the LRU node
                Node lru = removeAtTail();// removed the LRU node;
                map.remove(lru.key);
            }
            Node newNode = new Node(key,value);
                map.put(key,newNode);
                addNodeAtHead(newNode);
        }
        
    }
    public Node removeAtTail(){        
        Node lruNode = tail.prev;
        removeNode(lruNode);
        return lruNode;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */