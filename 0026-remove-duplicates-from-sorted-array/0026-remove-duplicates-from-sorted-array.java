class Solution {
    public int removeDuplicates(int[] a) {
        int j=1;
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[i-1]){
                a[j]=a[i];
                j++;
            }
        }
        return j;
    }
}