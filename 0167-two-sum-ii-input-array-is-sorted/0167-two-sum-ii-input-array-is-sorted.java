class Solution {
    public int[] twoSum(int[] a, int t) {
        int n=a.length;
        for(int i=0;i<n-1;i++){

            int find = binarySearch(a,t-a[i],i+1,n-1);

            if(find != -1){
                return new int[]{i+1,find+1};
            }
        }            
        return new int[]{-1,-1};
    }
    private int binarySearch(int []a,int t,int i, int j){
        while(i<=j){
            int mid = i+(j-i)/2;
            if(t==a[mid]){
                return mid;
            }else if(t<a[mid]){
                j= mid-1;
            }else{
                i=mid+1;
            }
        }
        return -1;
    }
}
//sc : o(1)