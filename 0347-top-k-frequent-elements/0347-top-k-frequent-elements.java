class Solution {
    public int[] topKFrequent(int[] a, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        Queue<Integer> minHeap = new PriorityQueue<>(
            (c,b) -> map.get(c) - map.get(b)
        );

        for(int i : map.keySet()){
            minHeap.offer(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[]b = new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            b[i++]=minHeap.poll();
        }
        return b;
    }
}