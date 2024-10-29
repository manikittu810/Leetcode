class Solution {
    public int fillCups(int[] a) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((b,c) -> c-b);
        for(int i : a){
            if(i>0){
            maxHeap.offer(i);
            }
        }
        int c = 0;
        while(maxHeap.size()>1){
            int n1 = maxHeap.poll()-1;
            int n2 = maxHeap.poll()-1;
            if(n1>0){
                maxHeap.offer(n1);
            }
            if(n2>0){
                maxHeap.offer(n2);
            }
            c++;
        }
        if(!maxHeap.isEmpty()){
            c+=maxHeap.poll();
        }
        return c;
    }
}