class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Pair<Integer,Integer>> minHeap = new PriorityQueue<>((b,c) ->{
            if(b.getFirst().equals(c.getFirst())){
                return b.getSecond() - c.getSecond();
            }
            return b.getFirst() - c.getFirst();
        });

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();

            minHeap.offer(new Pair(val,key));

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
    int[] res = new int[k];
    for(int i=0;i<k;i++){
        res[i] = minHeap.poll().getSecond();
    }
return res;
        
    }
}
public class Pair<U extends Comparable<U>,V extends Comparable<V>> implements Comparable<Pair<U,V>>{
    private final U first;
    private final V second;
    Pair(U first,V second){
        this.first = first;
        this.second = second;
    }

    public U getFirst(){return first;}
    public V getSecond(){return second;}

    @Override
    public int compareTo(Pair<U,V> other){
        return this.first.compareTo(other.first);
    }
}