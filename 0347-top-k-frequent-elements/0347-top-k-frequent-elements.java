class Solution {
    public int[] topKFrequent(int[] a, int k) {
     Map<Integer,Integer> map = new HashMap<>();
        for(int i : a){
                map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Pair<Integer,Integer>> minHeap = new PriorityQueue<>((b,c) ->{
            if(c.getFirst().equals(b.getFirst())){
                return b.getSecond() - c.getSecond();
            }
            return b.getFirst() -c.getFirst();
        });

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            int key = entry.getKey();
           int val = entry.getValue();

            minHeap.offer(new Pair<>(val, key));

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int []b = new int[k];
        for(int i=0;i<k;i++){
            b[i] = minHeap.poll().getSecond();
        }
        return b;
    }
}
class Pair<U extends Comparable<U>,V extends Comparable <V>> implements Comparable<Pair<U,V>>{
    final  U first;
    final  V second;
    Pair(U first,V second){
        this.first=first;
        this.second=second;
    }
    public U getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }
    @Override
    public int compareTo(Pair<U,V> other){
        return other.first.compareTo(this.first);
    }

}