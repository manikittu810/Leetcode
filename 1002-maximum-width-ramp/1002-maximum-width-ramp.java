class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int []suffixMaxArray = new int[n];

        suffixMaxArray[n-1] = nums[n-1]; 

        for(int i = n-2;i>=0;i--){
            suffixMaxArray[i] = Math.max(suffixMaxArray[i+1], nums[i]);
        }

        //using two pointers

        int l=0,r=0,maxWidth = 0;
        while(r<n){
            while(l<r && nums[l] > suffixMaxArray[r]){
                l++;
            }
            maxWidth = Math.max(maxWidth, r-l);
            r++;
        }
        return maxWidth;
    }
}