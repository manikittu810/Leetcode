class Solution {
    public int numOfSubarrays(int[] a, int k, int t) {
        int l=0,ans = 0,avg = 0,sum =0;
        for(int r = 0;r<a.length;r++){
            if(l <= a.length-k && r-l+1 <= k){
                sum+=a[r];
            }
            else{
                avg = sum/k;
                if(avg>=t){
                    ans++;
                }
                sum+=a[r];
                sum-=a[l];
                l++;
            }
        }
        if(sum/k>=t){
            ans++;
        }
        return ans;
    }
}