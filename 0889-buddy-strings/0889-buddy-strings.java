class Solution {
    public boolean buddyStrings(String s, String g) {
        if(s.length()!=g.length()){return false;}
            Set<Character> set = new HashSet<>();

        if(s.equals(g)){
            int []freqCount = new int[26];
            for(Character c :s.toCharArray()){
               freqCount[c-'a']++;
               if(freqCount[c-'a']>1){
                return true;
               }
            }
            return false;
        }

        List<Integer> l = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != g.charAt(i)){
                l.add(i);
            }
        }

        if(l.size()==2){
            int i = l.get(0);
            int j = l.get(1);

            return(s.charAt(i)==g.charAt(j) && s.charAt(j)==g.charAt(i));
        }
        return false;
    }
}