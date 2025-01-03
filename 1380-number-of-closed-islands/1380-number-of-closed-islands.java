class Solution {
    public int closedIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[][] directions = {
            {1,0},{-1,0},{0,-1},{0,1}
        };
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 0 &&
                (i==0 || i==row-1||j==0||j==col-1)){
                    dfs(grid,i,j);
                }
            }
        }
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(int[][]grid,int i,int j){
                if(i<0 || j<0
            || i>=grid.length || j>=grid[0].length ||grid[i][j]==1){
                    return;
                }
                grid[i][j]=1;
                dfs(grid,i+1,j);
                dfs(grid,i-1,j);
                dfs(grid,i,j+1);
                dfs(grid,i,j-1);
}
}