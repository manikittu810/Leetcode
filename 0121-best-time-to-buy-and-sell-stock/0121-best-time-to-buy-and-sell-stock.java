class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length==1){
            return 0;
        }
        int minPrice = prices[0],maxPrice = 0;

        for(int r=1;r<prices.length;r++){
            if(prices[r] > minPrice){
                maxPrice = Math.max(maxPrice, prices[r]-minPrice);
            }else{
                minPrice = prices[r];
            }
        }
        return maxPrice;
    }
}