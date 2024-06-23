class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int l=0;
        int maxLen  = 0 ;
        Set<Character> set =new HashSet<>();

        for(int r=0;r<s.length();r++){

            if(!set.contains(s.charAt(r))){

                set.add(s.charAt(r));

            }

            else {
               
                while(l<r && s.charAt(l)!=s.charAt(r)){

                        set.remove(s.charAt(l));

                        l++;

                    }
                    l++;
                }

            maxLen  = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}