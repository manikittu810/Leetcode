class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        for(int i=0; i<nums.length; i++){
            pq.offer(new int[]{nums[i], i});
        }
        
        for(int i=0; i<k; i++){
            int[] top = pq.remove();
            
            int new_num = ((top[0]*multiplier));
            nums[top[1]] = new_num;
            
            pq.offer(new int[]{new_num, top[1]});
        }
        return nums;
    }
}