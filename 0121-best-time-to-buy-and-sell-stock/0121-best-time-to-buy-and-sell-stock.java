class Solution {
    public int maxProfit(int[] a) {
        int l=0,r=1,maxProfit = 0;
        while(r<a.length){
            if(l<r && a[l]<a[r]){
                maxProfit = Math.max(maxProfit,a[r]-a[l]);
                r++;
            }else{
                l=r;
                r++;
            }
        }
        return maxProfit;
    }
}