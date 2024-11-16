class Solution {
    public int trap(int[] a) {
        if(a.length == 0){
            return 0;
        }
        int l = 0,r= a.length-1;
        int maxL = a[l];//0
        int maxR=a[r];//1
        int ans=0;
        while(l<r){
            if(maxL<=maxR){
                l++;
                maxL = Math.max(maxL,a[l]);
            int n = maxL - a[l];
            if(n>0){
                ans+=n;
            }
        }
        else if(maxL>maxR){
            r--;
            maxR = Math.max(maxR,a[r]);
            int n = maxR - a[r];
            if(n>0){
                ans+=n;
            }
        }
        }
        return ans;
    }
}