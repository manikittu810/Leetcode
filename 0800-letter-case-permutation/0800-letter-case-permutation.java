class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTrack(res,s,sb,0);
        return res;
    }
    private void backTrack(List<String> res, String s, StringBuilder sb, int idx){
        if(idx == s.length()){
            res.add(sb.toString());
            return;
        }
        if(Character.isDigit(s.charAt(idx))){
            sb.append(s.charAt(idx));
            backTrack(res,s,sb,idx+1);
            sb.deleteCharAt(sb.length()-1);
        }
        else{

            sb.append(Character.toLowerCase(s.charAt(idx)));
            backTrack(res,s,sb,idx+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append(Character.toUpperCase(s.charAt(idx)));
            backTrack(res,s,sb,idx+1);
            sb.deleteCharAt(sb.length()-1);

        }
    }
}