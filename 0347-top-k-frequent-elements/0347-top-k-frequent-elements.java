class Solution {
    public int[] topKFrequent(int[] a, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Queue<Integer> q = new PriorityQueue<>((b,c) -> map.get(b)-map.get(c));
        for(int i : map.keySet()){
            q.offer(i);
            while(q.size()>k){
                q.poll();
            }
        }
        int []arr = new int[k];
        int idx = 0;
        while(!q.isEmpty()){
            arr[idx++] = q.poll();
        }
        return arr;
    }
}
/**
1->3
2->2
3->1
*/