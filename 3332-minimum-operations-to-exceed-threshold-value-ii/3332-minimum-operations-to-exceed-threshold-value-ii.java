class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>(
            Arrays.stream(nums)
            .mapToLong(i->(long)i).boxed()
            .collect(Collectors.toList())
        );

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