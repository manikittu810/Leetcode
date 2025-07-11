class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        if(n==0){
            return l;
        }
        StringBuilder sb = new StringBuilder();
        backTrack(0,0,n,l,sb);
        return l;
    }
    private void backTrack(int openBracket,
     int closedBracket,int n,
     List<String>l,
     StringBuilder sb){

        if(sb.length() == 2*n){
            l.add(sb.toString());
            return ;
        }

        if(openBracket < n){
            sb.append('(');
            backTrack(openBracket+1,closedBracket,n,l,sb);
            sb.deleteCharAt(sb.length()-1);
        }

        if(closedBracket < openBracket){
            sb.append(')');
            backTrack(openBracket,closedBracket+1,n,l,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}