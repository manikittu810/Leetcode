class Solution {
    public int maxProfit(int[] a) {
        if(a.length==0 || a.length==1){
            return 0;
        }

        int maxProfit = 0, l=0;
        for(int r =0;r<a.length;r++){
            if(a[l]<=a[r]){
                maxProfit = Math.max(maxProfit,a[r]-a[l]);
            }else{
                l=r;
            }
        }
        return maxProfit;
    }
}