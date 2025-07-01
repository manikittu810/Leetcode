class Solution {
    public int maxArea(int[] h) {
        int l=0, r = h.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(l<r){
            int breadth = r-l;
            int height = Math.min(h[r],h[l]);
            int area = breadth * height;
            maxArea = Math.max(area, maxArea);
            if(h[l]<h[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}