class Solution {
    public boolean validPalindrome(String s) {
        return twoPointerHelper(s,0,s.length()-1,0);
    }
    private boolean twoPointerHelper(String s, int l, int r, int count){
        if(count>1){
            return false;
        }
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                 return (twoPointerHelper(s,l+1,r,count+1)||twoPointerHelper(s,l,r-1,count+1));
            }
            l++;
            r--;
        }
        return true;
    }
}