class Solution {
    public int findMin(int[] a) {
        int l=0,r=a.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(a[l]>a[r] && a[mid]>a[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return a[r];
    }
}