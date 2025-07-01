class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int max = 0;
        for(int i:set){
            int curVal = i;
            int localMax = 1;
            if(!set.contains(i-1)){
                while(set.contains(i+1)){
                    i++;
                    localMax++;
                }
            }
            max = Math.max(max,localMax);
        }
        return max;
    }
}