class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[]a = s.toCharArray();
        int l=0;
        int maxLen = 0;
        for(int r=0;r<a.length;r++){
            while(set.contains(a[r])){
                    set.remove(a[l]);
                    l++;
                }
                set.add(a[r]);
                maxLen = Math.max(maxLen,r-l+1);                
        }
        return maxLen;
    }
}