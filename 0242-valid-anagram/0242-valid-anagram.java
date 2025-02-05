class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[]c1 = new int[26];
        for(Character c : s.toCharArray()){
            c1[c-'a']++;
        }
        for(Character c : t.toCharArray()){
            c1[c-'a']--;
            if(c1[c-'a']<0){
                return false;
            }
        }
        for(int i :c1){
            if(i!=0){
                return false;
            }
        }
    return true;
    }
}