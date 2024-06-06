class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int[] countGrp = new int[s.length()];
        int grpIdx = 0;
        countGrp[0] =1;
        int ans = 0;
        for(int i=1;i<s.length();i++){
                if(s.charAt(i-1) == s.charAt(i)){
                    countGrp[grpIdx]++;
                }
                else{
                    countGrp[++grpIdx]=1;
                }
        }
        for(int i=1;i<=grpIdx;i++){
            ans+=Math.min(countGrp[i-1],countGrp[i]);
        }
        return ans;
    }
}