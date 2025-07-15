class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {

        if(a.length > b.length){
            return findMedianSortedArrays(b,a);
        }

        int m = a.length;//[2]
        int n = b.length;//[1,3]

        int total = m+n;
        int half = total/2;

        int l=0,r=m;

       

        while(true){
             int i = (l+r)/2;
        int j = half-i;
            int aLeft = (i==0) ? Integer.MIN_VALUE : a[i-1];
            int bLeft = (j==0) ? Integer.MIN_VALUE : b[j-1];
            int aRight = (i==m) ? Integer.MAX_VALUE : a[i];
            int bRight = (j==n) ? Integer.MAX_VALUE :b[j];

            if(aLeft<=bRight && bLeft<=aRight){
                if(total%2==0){
                return ((double) Math.max(aLeft,bLeft)+Math.min(aRight,bRight))/2;
                }else{
                    return Math.min(aRight,bRight);
                }
            }else if(aLeft > bRight){
                r=i-1;
            }else{
                l=i+1;
            }
        }
    }
}