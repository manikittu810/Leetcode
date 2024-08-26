class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int popPtr = 0;
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek() == popped[popPtr]){
                st.pop();
                popPtr++;
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
        }
    }