class Solution {
    public int countVowelSubstrings(String word) {
        int count =0;
        for(int start=0;start<word.length();start++){
        HashSet<Character> set = new HashSet<>();
        for(int end = start;end<word.length();end++){
            char c  = word.charAt(end);
            if(isVowel(c)){
                set.add(c);
                if(set.size()==5){
                    count++;
                }
            }
            else{
                break;
            }
        }
        }
        return count;
    }
    public boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}