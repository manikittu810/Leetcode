class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        if(n==0){
            return l;
        }
        Stack<Character> st = new Stack<>();
        backTrack(0,0,n,l,st);
        return l;
    }
    private void backTrack(int openBracket,
     int closedBracket,int n,
     List<String>l,
     Stack<Character> st){

        if(st.size() == 2*n){
            StringBuilder sb = new StringBuilder();
            for(Character c : st){
            sb.append(c);
            }
            l.add(sb.toString());
            return ;
        }

        if(openBracket < n){
            st.push('(');
            backTrack(openBracket+1,closedBracket,n,l,st);
            st.pop();
        }

        if(closedBracket < openBracket){
            st.push(')');
            backTrack(openBracket,closedBracket+1,n,l,st);
            st.pop();
        }
    }
}