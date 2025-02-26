class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((b,c) ->{
        if(b.getFirst().equals(c.getFirst())){
                return b.getSecond() - c.getSecond();
        }
        return b.getFirst() - c.getFirst();

        });

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
                int key = entry.getKey();
                int val = entry.getValue();
                pq.offer(new Pair<>(val,key));
                while(pq.size()>k){
                        pq.poll();
                }
        }
        int []res = new int[k];
        int idx = 0;
        while(pq.size()>0){
        int n= pq.poll().getSecond();
        res[idx++] = n;
        }
        return res;
    }
}
class Pair<U extends Comparable<U>,V extends Comparable<V>> implements  Comparable<Pair<U,V>>{
        private U first;
        private V second;
        public Pair(U first, V second){
                this.first = first;
                this.second = second;
        }
        public U getFirst(){return first;}
        public V getSecond(){return second;}
        public int compareTo(Pair<U,V> other){
        return this.first.compareTo(other.first);
        }
}
