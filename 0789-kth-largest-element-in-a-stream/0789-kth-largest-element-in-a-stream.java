class KthLargest {

PriorityQueue<Integer> minHeap ;
int k;
    public KthLargest(int k, int[] nums) {
       minHeap = new PriorityQueue<>();
        this.k = k;
        for(int i : nums){
            minHeap.offer(i);
            while(minHeap.size()>k){
            minHeap.poll();
        }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        while(minHeap.size()>k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */