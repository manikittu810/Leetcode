class Solution {
    public int largestRectangleArea(int[] height) {
        if(height.length==1){
            return height[0];
        }
        Stack<Integer> st=new Stack<>();
        int max = 0,breadth = 0;
        for(int i=0;i<=height.length;i++){
         int h = (i == height.length) ? 0 : height[i];
            while(!st.isEmpty() && height[st.peek()] > h){
                int idx = st.pop();//last idx 
                int hIdx = height[idx];
                int width=(st.isEmpty()) ? i : i - st.peek()-1;
               int area = width * hIdx;
                max = Math.max(max,area);
            }
            st.push(i);
        }
        return max;
    }
}
/*
[2,1,5,6,2,3]

 */