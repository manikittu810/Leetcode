class Solution {
    public int maxArea(int[] a) {
        int l=0,r=a.length-1;int maxArea = 0;
        while(l<r){
            int len = r-l;
            int breadth = Math.min(a[l],a[r]);
            int area = len * breadth;
            maxArea = Math.max(area,maxArea);
            if(a[l]<a[r]){l++;}else{r--;}
        }
        return maxArea;
    }
}