class Solution {
    public String removeStars(String s) {
        if(s.length() == 0){
            return s;
        }
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();//O(N)
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='*'){
               st.push(ch[i]);
            }
            else{
                 if(!st.isEmpty() && ch[i]=='*'){
                    st.pop();
                }
            }
           
        }
        for(int i =st.size()-1;i>=0;i--){
            sb.append(st.pop());
        }
        String s1 =sb.reverse().toString();
        return s1;
    }
}