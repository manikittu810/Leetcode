class Solution {
    public int findDuplicate(int[] nums) {
        int fptr = 0;
        int sptr = 0;

        do{
            sptr = nums[sptr];
            fptr = nums[nums[fptr]];
        }while(sptr!=fptr);

        sptr = 0;
        while(sptr != fptr){
            sptr = nums[sptr];
            fptr = nums[fptr];
        }
        return sptr;

    }
}