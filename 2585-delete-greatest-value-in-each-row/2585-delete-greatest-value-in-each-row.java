class Solution {
    public int deleteGreatestValue(int[][] a) {
        List<PriorityQueue<Integer>> l =new ArrayList<>();
        int row = a.length;
        int col = a[0].length;

        for(int i=0;i<row;i++){
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<col;j++){
                maxHeap.offer(a[i][j]);
            }
            l.add(maxHeap);
        }
        int result = 0;

        
        for(int j=0;j<col;j++){
            int n=-1;
            for(int i=0;i<row;i++){
                PriorityQueue<Integer> maxHeap = l.get(i);
                int temp = maxHeap.poll();
                n = Math.max(n,temp);
            }
            result+=n;
        }
        return result;
    }
}