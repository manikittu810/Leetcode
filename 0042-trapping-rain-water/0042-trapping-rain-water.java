class Solution {
    public int trap(int[] a) {
        int maxleftnow = a[0],maxrightnow = a[a.length-1];
        int l = 0, r= a.length-1,sum =0;

        while(l<r){
            if(maxleftnow<=maxrightnow){
                l++;
               maxleftnow = Math.max(maxleftnow,a[l]);
                int n = maxleftnow - a[l];
                if(n>0){
                    sum+=n;
                }
            }else{
                r--;
                maxrightnow = Math.max(a[r],maxrightnow);
                int n = maxrightnow - a[r];
                if(n>0){
                    sum+=n;
                }
            }
        }
        return sum;
        
    }
}