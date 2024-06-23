class Solution {
    public int maxProfit(int[] a) {
        int maxProfit =0;
        int l=0,r=0;
        while(r< a.length){
           if(a[l]>a[r]){
            l=r;
           }
           else{
            maxProfit=Math.max(maxProfit,a[r]-a[l]);
           }
           r++;
        }
        return maxProfit;
    }
}