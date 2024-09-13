class Solution {
    public int findMin(int[] a) {
        int l = 0,h= a.length-1;
        while(l<h){
            int mid = (l+h)/2;
            if(a[l]>a[h] && a[mid]>a[h]){
                l=mid+1;
            }
            else if(a[l]<=a[h]){
                h= mid;
            }
            else{
                h= mid;
            }
        }
        return a[h];
    }
}