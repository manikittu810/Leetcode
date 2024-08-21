class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> l = new ArrayList<>();
        if(n == 0){
            return l;
        }
        backTrack(l,n,new StringBuilder(),0,0);
        return l;
    }
    private void backTrack(List<String> l,int n,StringBuilder sb, int openCount,int closedCount){
        if(sb.length() == 2*n){
            l.add(sb.toString());
            return;
        }
    if(openCount < n){
        sb.append('(');
        backTrack(l,n,sb,openCount+1,closedCount);
        sb.deleteCharAt(sb.length()-1);
    }
    if(closedCount < openCount){
        sb.append(')');
        backTrack(l,n,sb,openCount,closedCount+1);
        sb.deleteCharAt(sb.length()-1);
    }
    }
}