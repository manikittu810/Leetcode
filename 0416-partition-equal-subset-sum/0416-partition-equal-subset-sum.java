class Solution {
    public boolean canPartition(int[] a) {
        int sum =0;
        for(int i : a){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }

        return isTabulation(a,sum/2,a.length);
    }
    private boolean isTabulation(int[]a,int W,int n ){
        if(W==0){
            return true;
        }
        if(n==0){
            return false;
        }
        boolean[][]dp = new boolean[n+1][W+1];
        for(int i =0;i<=n;i++){
            dp[i][0] = true;
        }
        for(int j=1;j<=W;j++){
            dp[0][j] = false;
        }

        for(int i =1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(a[i-1]<=j){
                    dp[i][j] = dp[i-1][j-a[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}