class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArray = new int[nums.length];
        leftArray[0] = 1;
        for(int i=1;i<nums.length;i++){
            leftArray[i] =leftArray[i-1] * nums[i-1];
        }
        int rightArray = 1;
        for(int i=nums.length-1;i>=0;i--){
            leftArray[i] *=rightArray;
            rightArray*=nums[i];
        }
        return leftArray;
    }
}