class Solution {
    public int maxArea(int[] h) {
        int maxArea = Integer.MIN_VALUE;
        int l=0,r = h.length-1;
        while(l<r){
            int len = r-l;
            int breadth = Math.min(h[l],h[r]);
            int area = len * breadth;
            maxArea = Math.max(maxArea,area);
            if(h[l]<h[r]) l++;
            else r--;
        }
        return maxArea;
    }
}