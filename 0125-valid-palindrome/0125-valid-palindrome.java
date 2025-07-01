class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.trim().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0,j=s1.length()-1;
        while(i<=j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}