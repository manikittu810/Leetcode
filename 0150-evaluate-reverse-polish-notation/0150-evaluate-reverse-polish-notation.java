class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if("+-*/".contains(s)){
                int b = st.pop();
                int a = st.pop();
                switch(s){
                    case "+" : st.push(a+b); break;
                    case "-" : st.push(a-b); break;
                    case "*" : st.push(a*b); break;
                    case "/" : st.push(a/b); break;
                }
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}