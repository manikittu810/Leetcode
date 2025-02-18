class Solution {
    public String smallestNumber(String s) {
        int nums=1;
        Stack<Integer>st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=s.length();i++){
            st.push(nums++);
            if(i==s.length() || s.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
            }
        }
        return sb.toString();
    }
}