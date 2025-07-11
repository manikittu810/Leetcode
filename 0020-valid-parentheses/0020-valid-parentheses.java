class Solution {
    public boolean isValid(String s) {
        if(s.length() <=1){
            return false;
        }
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(!st.isEmpty() &&(
                (st.peek() == '{' && c == '}') || 
                (st.peek() == '[' && c == ']')|| 
                (st.peek() == '(' && c == ')')
            )){
                    st.pop();
                }else{
                    st.push(c);
                }
            }
        return st.isEmpty();

        }
}