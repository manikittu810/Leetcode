class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String c : tokens){
            if(c.equals("+") 
            || c.equals("-") 
            ||c.equals("*") 
            ||c.equals("/") 
            ){
                int b = st.pop();
                        int a = st.pop();
                switch(c){

                        

                        case "+" : st.push(a+b);break;
                        case "-" : st.push(a-b);break;
                        case "*" : st.push(a*b);break;
                        case "/" : st.push(a/b);break;
                }
            }else{
                st.push(Integer.parseInt(c));
            }
        }
        return st.pop();
    }
}
/*

 */