class Solution {
    public int longestConsecutive(int[] a) {
        Set<Integer> set = new HashSet<>();
        for(int i : a) {
            set.add(i);
        }
int longestStreak =0;
        for(int i : set){
if(!set.contains(i-1)){
    int curNum = i;
    int curCount = 1;
    while(set.contains(curNum+1)){
        curNum+=1;
        curCount+=1;
    }
    longestStreak = Math.max(longestStreak,curCount);
}
        }
        return longestStreak;
        
    }
}