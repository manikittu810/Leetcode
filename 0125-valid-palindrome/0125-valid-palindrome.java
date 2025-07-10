class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(s);
        int i = 0, j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;            
            }else{
                return false;
            }
        }
        return true;
    }
}