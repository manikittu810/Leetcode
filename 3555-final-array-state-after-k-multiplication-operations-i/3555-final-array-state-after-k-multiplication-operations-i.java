class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int res[] = new int[nums.length];

        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            pq.offer(new Pair<>(nums[i],i));
        }

        for(int i=0;i<k;i++){
            Pair<Integer,Integer> p = pq.poll();
            int f = p.getFirst();
            int s = p.getSecond();
            int product = f*multiplier;
            pq.offer(new Pair<>(product,s));
        }
        while(!pq.isEmpty()){
            Pair<Integer,Integer> p = pq.poll();
            int firstNum = p.getFirst();
            int idx = p.getSecond();
            res[idx] = firstNum;
        }
        return res;
    }
}

class Pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<Pair<U, V>> {
    final U first;
    final V second;

    Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public int compareTo(Pair<U, V> other) {
        int comp = this.first.compareTo(other.first);
        if(comp==0){
            return this.second.compareTo(other.second);
        }
        return comp;
    }
}
