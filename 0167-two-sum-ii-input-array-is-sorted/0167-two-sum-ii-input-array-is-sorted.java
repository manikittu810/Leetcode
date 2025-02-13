class Solution {
    public int[] twoSum(int[] a, int t) {
        int i=0,j=a.length-1;
        while(i<j){
            if(a[i]+a[j]==t){
                return new int[]{i+1,j+1};
            }else if(a[i]+a[j]<t){
                i++;
            }else{
                j--;
            }

        }
        return new int[]{-1,-1};
    }
}