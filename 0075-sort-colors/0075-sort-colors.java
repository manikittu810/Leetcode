class Solution {
    public void sortColors(int[] a) {
        int n = a.length;
        int l=0, mid =0,r=n-1;
        while(mid<=r){
            if(a[mid] == 0){
                int temp =a[l];
                a[l] = a[mid];
                a[mid] = temp;

                l++;
                mid++;
            }else if(a[mid] == 1){
                mid++;
        }else{
            int temp = a[mid];
            a[mid] = a[r];
            a[r] = temp;
r--;        }
    }
}
}