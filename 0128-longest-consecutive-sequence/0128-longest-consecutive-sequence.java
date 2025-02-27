class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {return 0;}
 	Set<Integer> set = new HashSet<>();
	for(int i : nums){
	set.add(i);
	}
	int maxStreak = 0;       
	for(int i : set){
        if(!set.contains(i-1)){
		    int curNum = i;
            int currentStreak = 1;
            while(set.contains(curNum+1)){
                curNum++;
                currentStreak++;
            }
		    maxStreak = Math.max(maxStreak, currentStreak);
        }
	}
	return maxStreak;
    }
}
