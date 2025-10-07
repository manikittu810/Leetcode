class Solution {
    public int[] productExceptSelf(int[] a) {
        int []prefixArr = new int[a.length];
        prefixArr[0] = 1;

        for(int i=1;i<a.length;i++){
            prefixArr[i] = prefixArr[i-1]*a[i-1];
        }
        int suffix = 1;
        for(int i=a.length-1;i>=0;i--){
            prefixArr[i] = suffix * prefixArr[i];
            suffix = suffix*a[i];
        }
    return prefixArr;
    }
}