class Solution {
    public int minOperations(int[] a, int k) {
        //active learning
        PriorityQueue<Long> minHeap = new PriorityQueue<>(
            Arrays.stream(a).mapToLong(x->(long)x).boxed().collect(Collectors.toList())
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