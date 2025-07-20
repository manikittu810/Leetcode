class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){return stones[0];}
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((Integer b, Integer c) -> c-b);

        for(int i : stones){
            maxHeap.offer(i);
        }
        while(maxHeap.size()>=2){
            int x = maxHeap.poll();
            int y= maxHeap.poll();

            if(x==y){
                continue;
            }else{
                maxHeap.offer(Math.abs(x-y));
            }
        }
        return (maxHeap.size()==1) ? maxHeap.peek() : 0;
    }
}