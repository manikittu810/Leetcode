class KthLargest {

PriorityQueue<Integer> minHeap = new PriorityQueue<>();
int v;
    public KthLargest(int k, int[] nums) {
        v=k;
        for(int i : nums){
            minHeap.offer(i);
            while(minHeap.size()>k){
            minHeap.poll();
        }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        while(minHeap.size()>v){
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