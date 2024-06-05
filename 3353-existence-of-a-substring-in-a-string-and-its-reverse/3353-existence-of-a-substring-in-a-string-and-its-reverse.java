class Solution {
    public boolean isSubstringPresent(String s) {
         StringBuilder sb = new StringBuilder();
         sb.append(s);
         String rev = sb.reverse().toString();
         int l1=0,h1=1;
         while(l1<h1 && h1<s.length()){
            if(!rev.contains(s.substring(l1,h1+1))){
                l1++;
                h1++;
            }
            else{
                return true;
            }
         }
         return false;
    }
}