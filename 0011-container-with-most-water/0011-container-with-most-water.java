class Solution {
    public int maxArea(int[] h) {
        int l=0,r=h.length-1;
        int max = Integer.MIN_VALUE;
        while(l<r){
            int breadth = Math.min(h[l],h[r]);
            int length = r-l;
            int area = breadth*length;
            max = Math.max(area,max);
            if(h[l]<=h[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}