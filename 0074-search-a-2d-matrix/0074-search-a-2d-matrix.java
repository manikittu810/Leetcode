class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int row = mat.length;
        int col = mat[0].length;
        //to search 1st element in the each row and 
        //also check whether the  falls inside the same 
        //row by comparing the target with the last element of the same row
        int top = 0,bottom = row-1;
        while(top<=bottom){
            int mid = top+(bottom-top)/2;

            if(t>=mat[mid][0] && t<=mat[mid][col-1]){
                return  bs(mat[mid],0,col-1,t);//this is where i'm stuck
            }else if(t<mat[mid][0]){
                bottom = mid-1;
            }else{
                top = mid+1;
            }
        }
    return false;

    }
    private boolean bs(int[]a,int i,int j,int t){
        while(i<=j){
            int mid=i+(j-i)/2;
            if(a[mid] == t){
                return true;
            }else if(a[mid] < t){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return false;
    }
}