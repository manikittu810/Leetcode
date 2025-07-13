class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int row = mat.length;
        int col = mat[0].length;

        int l = 0, r = row*col-1;

        while(l<=r){
            int mid = l +(r-l)/2;
            int val = mat[mid/col][mid%col];
            if(val==t){
                return true;
            }else if(val<t){
                l=l+1;
            }else{
                r = r-1;
            }
        }
        return false;
    }
}