class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum =0;
        for(int i : nums){
            sum+=i;
        }
        int sum1 = (sum+target)/2;
        if(Math.abs(target)>sum || (sum+target)%2!=0){
            return 0;
        }

        int[]dp = new int[sum+1];
        dp[0]=1;
        for(int i=0;i<n;i++){
            for(int j=sum1;j>=nums[i];j--){
                dp[j]+=dp[j-nums[i]];
            }
        }
        return dp[sum1];
    }
}