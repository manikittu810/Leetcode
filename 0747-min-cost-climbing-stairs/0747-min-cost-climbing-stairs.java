class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]memo = new int[cost.length+1];
        Arrays.fill(memo,-1);
        return Math.min(climbStair(cost,0,memo),climbStair(cost,1,memo));
    }
    private int climbStair(int[]cost,int i,int[]memo){
        if(i>=cost.length){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        memo[i] =  cost[i] + Math.min(climbStair(cost,i+1,memo),climbStair(cost,i+2,memo));
        return memo[i];
    }
}
