class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i: nums){
            minHeap.offer(i);
            while(minHeap.size()>2){
                minHeap.poll();
            }
        }
        int first = minHeap.poll();
        int second = minHeap.poll();

        return (first-1) * (second-1);

    }
}