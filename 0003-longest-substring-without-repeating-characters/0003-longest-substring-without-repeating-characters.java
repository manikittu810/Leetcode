class Solution {
    public int lengthOfLongestSubstring(String s) {
	if(s.length() == 0 || s.length() == 1){
		return s.length();
	}
 	int l=0,r=0,maxLen = 0;
	Set<Character> set = new HashSet<>();
	while(r<s.length()){
		if(l<=r &&!set.contains(s.charAt(r))){
			set.add(s.charAt(r));
			maxLen = Math.max(maxLen, r-l+1);
			r++;
		}else{
			r=l+1;
            l++;
			set = new HashSet<>();
		}
	}
	return maxLen;
    }
}