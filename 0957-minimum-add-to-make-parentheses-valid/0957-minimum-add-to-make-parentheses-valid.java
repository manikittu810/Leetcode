class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(Character c : s.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            }
            else if(!st.isEmpty() && st.peek() == '(' && c == ')'){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        return st.size();
    }
}