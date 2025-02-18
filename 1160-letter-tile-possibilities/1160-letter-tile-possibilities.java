class Solution {
    public int numTilePossibilities(String s) {
        Set<String> set = new HashSet<>();
        boolean []tracker = new boolean[s.length()];
        backTrack(s,new StringBuilder(),tracker,set);
        return set.size();
    }
    private void backTrack(String s, StringBuilder sb, boolean[] track, Set<String> set){
        if(sb.length()>0){//"" escapes this substring
            set.add(sb.toString());
            // return ;
        }
        for(int i=0;i<s.length();i++){
            if(!track[i]){
                track[i] = true;
                sb.append(s.charAt(i));
                backTrack(s,sb,track,set);
                track[i] = false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}