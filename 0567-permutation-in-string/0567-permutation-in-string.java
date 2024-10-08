class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        int[] countArr1 = new int[26];
        int[] countArr2 = new int[26];

        for(int i=0;i<s1.length();i++){
            countArr1[s1.charAt(i)-'a']++;
            countArr2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length()-s1.length();i++){
            if(matchFound(countArr1,countArr2)){return true;}

            countArr2[s2.charAt(i+s1.length())-'a']++;
            countArr2[s2.charAt(i)-'a']--;
        }
        return matchFound(countArr1,countArr2);
    }

    private boolean matchFound(int[] s1,int[] s2){
        for(int i=0;i<26;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
}