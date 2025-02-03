class Solution {
    public boolean containsDuplicate(int[] a) {
        int n = a.length;
        int temp = 0;
        for(int i=1;i<n;i++){
            if(a[i-1] == a[i]) return true;

            temp = a[i];

            if(a[i]<a[i-1]){
            for(int j=i-2;j>=0;j--){
                if(a[j] == temp) return true;
            }
            a[i] = a[i-1];
            a[i-1] = temp; 
        }
        }
        return false;
    }
}