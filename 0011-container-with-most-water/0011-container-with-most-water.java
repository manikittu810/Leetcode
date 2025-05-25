class Solution {
    public int maxArea(int[] h) {
        int i=0, j= h.length-1, max =0;
        while(i<j){
            int len = j-i;
            int breadth = Math.min(h[i],h[j]);
            int area = len * breadth;
            max = Math.max (max,area);
            if(h[i]<h[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}

/*
height should be more and length should be more 
height h[i] and also we can get the length from j-i;
area = l*b;
 */