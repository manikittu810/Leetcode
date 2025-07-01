class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b));
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int i : map.keySet()){
            minHeap.offer(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[]a= new int[k];int idx=0;
        while(!minHeap.isEmpty()){
            a[idx++] = minHeap.poll();
        }
        return a;
    }
}