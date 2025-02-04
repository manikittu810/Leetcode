class Solution {
    public int maxAscendingSum(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }

        int globalMax = Integer.MIN_VALUE;
        int prefixSum = nums[0];

        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                prefixSum+=nums[i];

            }else{
                globalMax = Math.max(globalMax,prefixSum);
                prefixSum = nums[i];
            }
            globalMax = Math.max(globalMax,prefixSum);
        }
        return globalMax;
    }
}