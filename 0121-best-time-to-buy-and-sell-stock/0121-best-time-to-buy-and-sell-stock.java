class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length==1){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i : prices){
            minPrice = Math.min(minPrice, i);
            maxProfit = Math.max(maxProfit,i-minPrice);
        }
        return maxProfit;
    }
}