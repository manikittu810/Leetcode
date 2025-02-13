class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[]ch2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();

        int m= ch1.length,n = ch2.length,i=0,j=0;
        while(i<m && j<n){
            sb.append(ch1[i++]);
            sb.append(ch2[j++]);
        }
        while(i<m){
            sb.append(ch1[i++]);
        }
        while(j<n){
            sb.append(ch2[j++]);
        }
    return sb.toString();
    }
}