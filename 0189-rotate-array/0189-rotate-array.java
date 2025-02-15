class Solution {
    public void rotate(int[] a, int k) {
        
        k=k%a.length;
        reverse(0,a.length-1,a);
        reverse(0,k-1,a);
        reverse(k,a.length-1,a);
        }
    private void reverse(int l, int r, int[]a){
        while(l<r){
            int temp = a[l];
            a[l] = a[r];
            a[r] =temp;
            l++;
            r--;
        }
    }
}