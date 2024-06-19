class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]","");
        int i=0,j=s1.length()-1;
        while(i<=j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
            
        }
        return true;
    }
}