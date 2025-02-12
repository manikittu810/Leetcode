class Solution {
    public String mergeAlternately(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        char []ch1 = s1.toCharArray();
        char []ch2 = s2.toCharArray();

        StringBuilder sb = new StringBuilder();
        int l=0, r= 0;
        while(l<n && r<m){
            sb.append(ch1[l++]);
            sb.append(ch2[r++]);
        }
        while(l<n){
            sb.append(ch1[l++]);
        }
        while(r<m){
            sb.append(ch2[r++]);
        }
        return sb.toString();
    }
}