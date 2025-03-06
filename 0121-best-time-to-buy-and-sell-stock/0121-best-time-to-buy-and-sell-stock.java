class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length==1){
            return 0;
        }
        int l=0,r=1,maxProfit = 0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
                r++;
            }else{
                l=r;
                r++;
            }
        }
        return maxProfit;
    }
}