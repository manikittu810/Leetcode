class Solution {
    public int minOperations(int[] a, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for(long i : a){
            minHeap.offer(i);
        }
        int count = 0;
        while(minHeap.size()>1 && minHeap.peek()<k){
            long x = minHeap.poll();
            long y = minHeap.poll();
            minHeap.offer((x*2)+y);
            count++;
        }
        return count;
}
}