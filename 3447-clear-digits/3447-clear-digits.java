class Solution {
    public String clearDigits(String s) {
        Stack<Character> st= new Stack<>();
        for(Character c : s.toCharArray()){
            int i = (int) c;
            if(i>=97 && i<=122){
                st.push(c);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
/*
abc 

 */