class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1, maxProfit = 0;
        while(r<prices.length){
            if(l<r && prices[r] > prices[l]){
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