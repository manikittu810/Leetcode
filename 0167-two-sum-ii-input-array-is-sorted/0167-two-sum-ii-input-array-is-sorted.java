class Solution {
    public int[] twoSum(int[] a, int t) {
        int i=0,j=a.length-1;
        while(i<=j){
            if(a[i]+a[j]<t){
                i++;
            }else if(a[i]+a[j]>t){
                j--;
            }else{
                return new int[]{i+1,j+1};
            }
        }
return new int[]{-1,-1};
    }
}