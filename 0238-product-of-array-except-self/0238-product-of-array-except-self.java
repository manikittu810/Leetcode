class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[]prefixProducts = new int[n];
        int[] suffixProducts = new int[n];

        prefixProducts[0] = 1;
        for(int i=1;i<n;i++){
            prefixProducts[i] = prefixProducts[i-1]*nums[i-1];
            System.out.print(prefixProducts[i]+" ");
        }
         System.out.println();
        suffixProducts[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            suffixProducts[i] = suffixProducts[i+1]*nums[i+1];
            System.out.print(suffixProducts[i]+" ");

        }

        for(int i=0;i<n;i++){
            ans[i] = suffixProducts[i]* prefixProducts[i];
        }
return ans;
    }
}