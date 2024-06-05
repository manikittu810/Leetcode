class Solution {
    public int countVowelSubstrings(String word) {
        int count =0;
        for(int start=0;start<word.length();start++){
        Map<Character,Integer> map = new HashMap<>();
        for(int end = start;end<word.length();end++){
            char c  = word.charAt(end);
            if(isVowel(c)){
                map.put(c,map.getOrDefault(c,0)+1);
                if(map.size()==5){
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