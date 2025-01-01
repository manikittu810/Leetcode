class Solution {
    public int findTargetSumWays(int[] a, int d) {
        int n = a.length;
        int sum=0;
        for(int i : a){
            sum+=i;
        }

        int sum1 = (sum+d)/2;
        if((sum+d)%2!=0 || Math.abs(d)>sum){
            return 0;
        }

        int[][]dp = new int[n+1][sum1+1];
        dp[0][0]=1;

        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum1;j++){
                if(j>=a[i-1]){
                    dp[i][j]=dp[i-1][j-a[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum1];
    }
}