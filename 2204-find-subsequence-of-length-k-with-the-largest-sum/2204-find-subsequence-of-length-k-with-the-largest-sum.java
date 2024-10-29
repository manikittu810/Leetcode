class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Pair<Integer,Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Pair::getFirst));
        for(int i=0;i<nums.length;i++){
            minHeap.offer(new Pair(nums[i],i));
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

    List<Pair<Integer,Integer>> res = new ArrayList<>(minHeap);
    res.sort(Comparator.comparingInt(Pair::getSecond));

        int b[] = new int[k];
        for(int i = 0; i<k;i++){
           b[i] = res.get(i).getFirst();
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