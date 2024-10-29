class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Pair<Integer,Integer>> minHeap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.offer(new Pair(nums[i],i));
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

    PriorityQueue<Pair1<Integer,Integer>> heap = new PriorityQueue<>();

    for(int i=0;i<k;i++){
        Pair<Integer,Integer> p = minHeap.poll();
        int first = p.getFirst();
        int second = p.getSecond();
        heap.offer(new Pair1(first,second));
    }

        int b[] = new int[k];
        for(int i = 0; i<k;i++){
           Pair1<Integer,Integer> p = heap.poll();
           int n = p.getFirst();
           b[i] = n;
        }
        return b;
    }
}
class Pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<Pair<U,V>>{
    final U first;
    final V second;

    public Pair(U first,V second){
        this.first=first;
        this.second= second;
    }

    public U getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }

    @Override
    public int compareTo(Pair<U,V> other){
        return this.first.compareTo(other.first);
    }
}
class Pair1<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<Pair1<U,V>>{
    final U first;
    final V second;

    public Pair1(U first,V second){
        this.first=first;
        this.second= second;
    }

    public U getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }

    @Override
    public int compareTo(Pair1<U,V> other){
        return this.second.compareTo(other.second);
    }
}