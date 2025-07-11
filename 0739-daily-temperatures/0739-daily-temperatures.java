class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[]res = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty() && temp[st.peek()] < temp[i]){
                int prevDay = st.pop();
                res[prevDay] = i-prevDay;
            }
            st.push(i);
        }
        return res;
    }
}