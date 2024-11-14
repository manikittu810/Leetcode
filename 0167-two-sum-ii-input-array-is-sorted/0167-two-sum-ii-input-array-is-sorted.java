class Solution {
    public int[] twoSum(int[] a, int t) {
        int l=0,r=a.length-1;

        while(l<r){
            if(a[l]+a[r]==t){
                return new int[]{l+1,r+1};
            }
            else if(a[l]+a[r] < t){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[]{-1,-1};
    }
}