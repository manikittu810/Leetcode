class Solution {
    public int search(int[] a, int t) {
        int l=0, r=a.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(a[mid] == t){
                return mid;
            }
            if(a[mid]<=a[r]){
                if(a[mid] < t && a[r]>=t){ // a[mid] > t && a[r]>=t -> a[mid] >t <=a[r]
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }else if(a[mid] >= a[l]){
                if(a[l]<=t && a[mid]>t){
                   r=mid-1;
                }else {
                    l=mid+1;
                }
            }
        }
        return -1;
    }
}