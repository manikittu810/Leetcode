class Solution {
    public long pickGifts(int[] a, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((b,c)->c-b);
        for(int i : a){
            maxHeap.offer(i);
        }
        for(int i=0;i<k;i++){
            int  n = maxHeap.poll();
            Double m = Math.sqrt(n);
            int z = m.intValue();
            maxHeap.offer(z);
        }
        long sum = 0;
        while(!maxHeap.isEmpty()){
            sum+=maxHeap.poll();
        }
        return sum;
    }
}