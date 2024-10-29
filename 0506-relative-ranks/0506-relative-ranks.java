class Solution {
    public String[] findRelativeRanks(int[] a) {
        PriorityQueue<Pair<Integer,Integer>> heap = new PriorityQueue<>();

        for(int i=0;i<a.length;i++){
            heap.offer(new Pair<>(a[i],i));
        }

        String[] b = new String[a.length];
        int place = 1;

        while(heap.size()!=0){
            Pair<Integer,Integer>  p = heap.poll();
            int index = p.second;
            if(place == 3){
            b[index] = "Bronze Medal";
            }
            else if(place == 2){
                b[index] = "Silver Medal";
            }
            else if(place == 1){
                b[index] = "Gold Medal";
            }
            else{
                b[index] = Integer.toString(place);
            }
            place++;
        }
        return b;
    }
}

class Pair<U extends Comparable<U>,V> implements Comparable<Pair<U,V>>{
     final U first;
     final V second;
     public Pair(U first,V second){
        this.first= first;
        this.second = second;
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