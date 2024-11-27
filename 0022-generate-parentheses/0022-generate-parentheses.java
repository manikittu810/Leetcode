class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        Stack<Character> st = new Stack<>();
        backTrack(l,n,n,n,st);
        return l;
    }
    private void backTrack(List<String> l,
    int n, int openBracket,int closedBracket,Stack<Character> st){
        if(st.size() == 2*n){
            StringBuilder sb = new StringBuilder();
            for(Character c : st){
                sb.append(c);
            }
            l.add(sb.toString());
            return ;
        }
        if(openBracket>0){
            st.push('(');
            backTrack(l,n,openBracket-1,closedBracket,st);
            st.pop();
        }
        if(closedBracket>openBracket){
            st.push(')');
            backTrack(l,n,openBracket,closedBracket-1,st);
            st.pop();
        }
    }
    
}