class Solution {
    public int maxArea(int[] a) {
        int maxArea = 0;
        int l=0,r= a.length-1;
        while(l<r){
            int breadth = Math.min(a[l],a[r]);
            int length = r-l;
            int area = length*breadth;
            maxArea=Math.max(maxArea,area);
            if(a[l]<a[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
}