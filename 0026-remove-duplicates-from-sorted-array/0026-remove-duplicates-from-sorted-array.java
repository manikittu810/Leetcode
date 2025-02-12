class Solution {
    public int removeDuplicates(int[] a) {
        int n = a.length;
        if(n==0){return 0;}
        int j = 0;
        for(int i=0;i<n;i++){
            if(a[i]!=a[j]){
                j++;
                a[j] = a[i];
            }
        }
        return j+1;
    }
}