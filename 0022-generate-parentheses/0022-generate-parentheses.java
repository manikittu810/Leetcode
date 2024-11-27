class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
StringBuilder sb = new StringBuilder();
        backTrack(l,n,n,n,sb);
        return l;
    }
    private void backTrack(List<String> l,
    int n, int openBracket,int closedBracket,StringBuilder sb){
        if(sb.length() == 2*n){
            l.add(sb.toString());
            return ;
        }
        if(openBracket>0){
            sb.append('(');
            backTrack(l,n,openBracket-1,closedBracket,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(closedBracket>openBracket){
            sb.append(')');
            backTrack(l,n,openBracket,closedBracket-1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
}