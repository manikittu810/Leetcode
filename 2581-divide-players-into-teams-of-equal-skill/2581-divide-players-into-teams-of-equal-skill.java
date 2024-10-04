class Solution {
    public long dividePlayers(int[] a) {

        if(a.length%2!=0){
            return -1;
        }

        Arrays.sort(a);//n log n

        int l=0,r=a.length-1;
        long  chem=0;
        long targetSum = a[l]+a[r];// for reference

        while(l<r){//O(n) tc

        long currentSum = a[l]+a[r];

        if(currentSum!=targetSum){
            return -1;
        }
            chem+=(long)a[l]*a[r];
            l++;r--;
        }
        return chem;
    }
}