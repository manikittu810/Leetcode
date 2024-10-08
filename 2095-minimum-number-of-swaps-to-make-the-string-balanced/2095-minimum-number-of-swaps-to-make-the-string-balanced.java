class Solution {
    public int minSwaps(String s) {
    int swaps = 0;
    Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    swaps++;
                }
            }
        }
        return (swaps+1)/2;
    }
}