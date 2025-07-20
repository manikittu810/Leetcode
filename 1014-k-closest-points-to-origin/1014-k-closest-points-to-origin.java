class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(distance(b),distance(a)));
        
        for(int[] p : points){
            maxHeap.offer(p);
            while(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for(int i=0;i<k;i++){
            result[i] = maxHeap.poll();
        }
        return result;
    }
    private int distance(int[]points){
        return points[0]*points[0] + points[1]*points[1];
    }
}