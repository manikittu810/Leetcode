class Solution {
    public int maxProfit(int[] a) {
        int l=0,r=0;
        int max = 0;
        while(r<a.length){
           if(a[l]>a[r]){
            l=r;
           }
           else{
            max = Math.max(max,a[r]-a[l]);
           }
           r++;
        }
        return max;
    }
}