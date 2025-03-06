class Solution {
    public int maxProfit(int[] a) {
        if(a.length == 0 || a.length == 1){
            return 0;
        }
        int minPrice=a[0],maxProfit = 0;
        for(int r = 1;r<a.length;r++){
            if(a[r]>minPrice){
                maxProfit = Math.max(maxProfit, a[r]-minPrice);
            }else{
                minPrice=a[r];
            }
            
        }
        return maxProfit;
    }
}