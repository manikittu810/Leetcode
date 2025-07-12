class Solution {
    public int largestRectangleArea(int[] height) {
        if(height.length == 1){
            return height[0];
        }
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=height.length;i++){
            int h = (i==height.length) ? 0 : height[i];
            while(!st.isEmpty() && height[st.peek()] > h){
                int curBarIdx = st.pop();
                int length = height[curBarIdx];
                int width = (st.isEmpty()) ? i : i-st.peek()-1;
                int area = length * width;
                maxArea = Math.max(maxArea,area);
            }
            st.push(i);
        }
        return maxArea;
    }
}