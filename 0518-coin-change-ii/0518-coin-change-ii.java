class Solution {
    public int change(int W, int[] a) {
        int[]dp = new int[W+1];
        dp[0]=1;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<=W;j++){
                if(j>=a[i]){
                dp[j] = dp[j]+dp[j-a[i]];
                }
            }
        }
        return dp[W];
    }
}