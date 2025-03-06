class Solution {
    public int trap(int[] a) {
        int l=0,r =a.length-1,ans=0;
        int maxLeft = a[l], maxRight = a[r];

        while(l<r){
            if(maxLeft <= maxRight){
                l++;
                maxLeft = Math.max(maxLeft,a[l]);
                int n = maxLeft - a[l];
                if(n>0){
                    ans+=n;
                }
            }

            if(maxLeft > maxRight){
                r--;
                maxRight = Math.max(maxRight, a[r]);
                int n = maxRight - a[r];
                if(n>0){
                    ans+=n;
                }
            }
        }
        return ans;
    }
}