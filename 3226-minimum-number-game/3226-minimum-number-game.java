class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.offer(i);
        }
        int []arr = new int[nums.length];
        int idx=0;
        while(!pq.isEmpty()){
            int alice = pq.poll();
            int bob = pq.poll();
            arr[idx++] = bob;
            arr[idx++] = alice;
        }

return arr;
    }
}