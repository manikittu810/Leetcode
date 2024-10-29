class Solution {
    public int lastStoneWeight(int[] a) {
        if(a.length ==1){
            return a[0];
        }
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((Integer c,Integer b) -> b - c);
        for(int i : a){
            maxHeap.offer(i);
        }

        while(maxHeap.size()>=2){
            int x= maxHeap.poll();
            int y = maxHeap.poll();
            if(x==y){
                continue;
            }
            else{
                maxHeap.offer(Math.abs(y-x));
            }
        }
        return (maxHeap.size()==1) ? maxHeap.peek() : 0;
    }
}