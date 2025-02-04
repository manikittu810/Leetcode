class Solution {
    public int longestMonotonicSubarray(int[] a) {
        if(a.length ==1){
            return a.length;
        }

        int maxLen =1;
        int increaseBy1 = 1;
        int decreaseBy1 = 1;
        for(int i =1;i<a.length;i++){
            if(a[i]<a[i-1]){
                increaseBy1++;
                decreaseBy1=1;
            }else if(a[i]>a[i-1]){
                increaseBy1=1;
                decreaseBy1++;
            }else{
                increaseBy1=1;
                decreaseBy1=1;
            }
            maxLen = Math.max(maxLen,Math.max(increaseBy1,decreaseBy1));
        }
        return maxLen;
    }
}