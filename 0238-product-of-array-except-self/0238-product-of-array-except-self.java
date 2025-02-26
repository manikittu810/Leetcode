class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length];

        prefix[0] = 1;

        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }



        int []suffix= new int[nums.length];

        suffix[nums.length-1] = 1;



        for(int i=nums.length-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        int []res = new int[nums.length];
        for(int i=0;i<res.length;i++){
            res[i] = suffix[i]*prefix[i];
        }
        return res;
    }
    /*
    [1,2,6,24]
    [24,24,12,4]
    
     */
}