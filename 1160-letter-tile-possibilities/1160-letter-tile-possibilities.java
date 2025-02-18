class Solution {
    public int numTilePossibilities(String s) {
        Set<String> set = new HashSet<>();
        boolean []tracker = new boolean[s.length()];
        backTrack(s,new StringBuilder(),tracker,set);
        return set.size();
    }
    private void backTrack(String s, StringBuilder sb, boolean[] tracker, Set<String> set){
        if(sb.length()>0){
            set.add(sb.toString());
        }

        for(int i=0;i<s.length();i++){
            if(!tracker[i]){
                tracker[i] = true;
                sb.append(s.charAt(i));
                backTrack(s,sb,tracker,set);
                tracker[i] = false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}