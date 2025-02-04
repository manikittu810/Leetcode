class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
                set.add(nums[i]);
        }

        int longestStreak = 0;

        for(int i : set){
            if(!set.contains(i-1)){
                int cur = i;
                 int curStreak = 1;
                while(set.contains(cur+1)){
                    cur++;
                    curStreak ++;
                }
            longestStreak = Math.max(longestStreak,curStreak);
            }
        }
           return longestStreak;
    }
}