class Solution {
    public int[] productExceptSelf(int[] a) {
        int[]prefix = new int[a.length];
        prefix[0] = 1;
        for(int i=1;i<a.length;i++){
            prefix[i] = prefix[i-1] * a[i-1];
        }
        int suffix = 1;
        for(int i=a.length-1;i>=0;i--){
            prefix[i] = prefix[i] * suffix;
            suffix = suffix * a[i];
        }
    return prefix;

    }
}