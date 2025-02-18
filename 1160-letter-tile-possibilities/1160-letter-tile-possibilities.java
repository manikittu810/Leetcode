class Solution {
    public int numTilePossibilities(String s) {
        int[] count = new int[26];
        for(Character c : s.toCharArray()){
            count[c-'A']++;
        }
        return getTotalCount(count);
    }
    private int getTotalCount(int []count){
        int totalCount = 0;
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
            totalCount++;
            count[i]--;
            totalCount += getTotalCount(count);
            count[i]++;
            }
            
        }
        return totalCount;
    }
}