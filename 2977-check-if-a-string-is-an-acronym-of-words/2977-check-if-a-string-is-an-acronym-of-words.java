class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb  = new StringBuilder();
        for(int i=0;i<words.size();i++){
            String s1 =words.get(i);
            sb.append(s1.charAt(0));
        }
        if(sb.toString().equals(s)){
            return true;
        }
        return false;
    }
}