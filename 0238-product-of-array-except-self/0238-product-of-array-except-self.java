class Solution {
    public int[] productExceptSelf(int[] a) {
        int n = a.length;
        int[]ans = new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] * a[i-1];
        }
        int rightProduct = 1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=rightProduct;
            rightProduct*=a[i];
        }
        return ans;
    }
}