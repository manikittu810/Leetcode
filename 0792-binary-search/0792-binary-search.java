class Solution {
    public int search(int[] a, int t) {
            return bs(a,0,a.length-1,t);
    }
    private int bs(int[]a,int i,int j, int t){
        if(i>j){
            return -1;
        }
        int mid = (i+j)/2;
        if(a[mid] == t){
            return mid;
        }else if(a[mid]<t){
            return bs(a,mid+1,j,t);
        }else{
            return bs(a,i,mid-1,t);
        }
    }
}