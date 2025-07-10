class Solution {
    public int[] topKFrequent(int[] a, int k) {
        //[1,1,1,2,2,3], k=2
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            map.put(i, map.getOrDefault(i,0)+1);
            //[1->3,
            //2->2,
            //3->1]
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (d,b) -> map.get(d) - map.get(b)//thelavadhu
        );
        
        for(int i : map.keySet()){
            minHeap.offer(i);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[]res = new int[k];
        int idx =0;
        while(!minHeap.isEmpty()){
            res[idx++] = minHeap.poll();
        }
        return res;
    }
}

/*
1->3
2->2
 */