class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();

        if(n == 0){
            return l;
        }

        backTrack(l,n,new StringBuilder(),0,0);

        return l;
    }
    private void backTrack(List<String> l,int n,StringBuilder sb, int openC,int closedC)  {

            if(sb.length()==2*n){
                l.add(sb.toString());
                return ;
            }

            if(openC < n){
                sb.append('(');
                backTrack(l,n,sb,openC+1,closedC);
                sb.deleteCharAt(sb.length()-1);
            }
            if(closedC <openC){
                sb.append(')');
                backTrack(l,n,sb,openC,closedC+1);
                sb.deleteCharAt(sb.length()-1);
            }
    }
}