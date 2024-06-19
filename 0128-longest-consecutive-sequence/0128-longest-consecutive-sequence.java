class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> s = new HashSet<>();
        for(int i :nums){
            s.add(i);
        }
        int longStreak = 1;
        for(int i : s){
            if(!s.contains(i-1)){
                int curNum = i;
                int curStreak = 1;
                while(s.contains(curNum+1)){
                    curNum +=1;
                    curStreak +=1;
                }
            longStreak = Math.max(curStreak,longStreak);

            }
        }
return longStreak;
    }
}