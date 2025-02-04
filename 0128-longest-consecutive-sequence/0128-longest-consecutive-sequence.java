class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        
        for(int i : nums){
            set.add(i);
        }

        int longestStreak = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int curNum = i;
                int curStreak = 1;
                while(set.contains(curNum+1)){
                    curNum++;
                    curStreak++;
                }
                longestStreak = Math.max(longestStreak,curStreak);
            }
        }
        return longestStreak;
    }
}