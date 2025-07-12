class Solution {
    public int search(int[] a, int target) {
        int i=0,j= a.length-1;
        while(i<=j){
            int mid =(i+j)/2;
            if(a[mid] == target){
                return mid;
            }else if(a[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
}