class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<>();
        for(int i : a){
            if(st.isEmpty() || i>0){
                st.push(i);
            }
            else{
                boolean destroyed = false;;
                while(!st.isEmpty() && st.peek()>0){
                    if(st.peek()< Math.abs(i)){
                        st.pop();
                    }
                    else if(st.peek()==Math.abs(i)){
                        st.pop();
                        destroyed = true;
                        break;
                    }
                    else{
                        destroyed = true;
                        break;
                    }
                }
                if(!destroyed){
                    st.push(i);
                }
            }
            
        }
        int ans[] = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i] = st.pop();
        }
    return ans;
    }
}