class Solution {
    public int[] kWeakestRows(int[][] a, int k) {
        PriorityQueue<Pair<Integer,Integer>> maxHeap = new PriorityQueue<>((p1,p2) -> {
            if(p1.getFirst().equals(p2.getFirst())){
                return p2.getSecond() - p1.getSecond();
            }
            return p2.getFirst()-p1.getFirst();
        }
        );

        for(int i=0;i<a.length;i++){
            int count = 0;
            for(int j=0;j<a[i].length;j++){
                if(a[i][j] == 1){
                    count++;
                }
            }
            maxHeap.offer(new Pair<>(count, i));
            while(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        int[] b = new int[k];
        for(int i=k-1;i>=0;i--){
            Pair<Integer,Integer> p = maxHeap.poll();
            int index = p.getSecond();
            b[i] = index;
        }
        return b;
    }
}

class Pair<U ,V>{
    final U first;
    final V second;
    public Pair(U first,V second){
        this.first = first ;
        this.second = second;
    }
    public U getFirst(){
        return first;
    }

    public V getSecond(){
        return second;
    }
}