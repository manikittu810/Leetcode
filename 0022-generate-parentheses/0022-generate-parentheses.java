class Solution {
        List<String> res = new ArrayList<>();
        Stack<Character> st = new Stack<>();
    public List<String> generateParenthesis(int n) {
        backTrack(0,0,n);
        return res;
    }
    private void backTrack(int openCount,int closedCount,int n){

        if(closedCount == openCount && closedCount == n){
            StringBuilder sb = new StringBuilder();
           for(Character ch : st){
            sb.append(ch);
           }
           res.add(sb.toString());
            return ;
        }

        if(openCount < n){
            st.push('(');
            backTrack(openCount+1,closedCount,n);
            st.pop();
        }
        if(closedCount < openCount){
            st.push(')');
            backTrack(openCount,closedCount+1,n);
            st.pop();
        }
    }
}