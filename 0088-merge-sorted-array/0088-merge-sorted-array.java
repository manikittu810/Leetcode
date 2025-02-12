class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
       int l=m-1,r=n-1,k=m+n-1;
       while(l>=0 && r>=0 && k>=0){
        if(a[l]>=b[r]){
            a[k--]=a[l--];
        }else{
            a[k--] = b[r--];
        }
       }
       while(r>=0 && k>=0){
        a[k--]=b[r--];
       }
    }
}