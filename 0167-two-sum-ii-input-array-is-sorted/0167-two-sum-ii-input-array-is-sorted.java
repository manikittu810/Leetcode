class Solution {
    public int[] twoSum(int[] a, int t) {
        int l=0,r=a.length-1;
        while(l<r){
            int sum = a[l]+a[r];
            if(sum==t){
                return new int[]{l+1,r+1};
            }
            else if(sum<t){
                sum-=a[l];
                l++;
            }else{
                sum-=a[r];
                r--;
            }
        }
        return new int[]{-1,-1}
;    }
}