class Solution {
    public int trap(int[] a) {
        int l=0,r= a.length-1;
        int max_left_so_far = a[l];
        int max_right_so_far = a[r];
        int res =0;
        while(l<r){
            if(max_left_so_far<=max_right_so_far){
                l++;
                max_left_so_far = Math.max(max_left_so_far,a[l]);
                res+=max_left_so_far-a[l];
            }else{
                 r--;
                max_right_so_far = Math.max(max_right_so_far,a[r]);
                res+=max_right_so_far-a[r];
            }
        }
        return res;
    }
}