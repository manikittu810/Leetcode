class Solution {
    public void solve(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][]directions = {
            {1,0},{-1,0},{0,1},{0,-1}
        };
//step1 : 
        for(int i=0;i<row;i++){
            if(grid[i][0]=='O'){
                dfs(grid,i,0);
            }
            if(grid[i][col-1]=='O'){
                dfs(grid,i,col-1);
            }
        }

        for(int j=0;j<col;j++){
            if(grid[0][j]=='O'){
                dfs(grid,0,j);
            }
            if(grid[row-1][j]=='O'){
                dfs(grid,row-1,j);
            }
        }
        //step2:
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == '#'){
                    grid[i][j] = 'O';
                }else{
                    grid[i][j] = 'X';
                }
            }
        }
    }
    private void dfs(char[][]grid,int i,int j){
       if(i<0 || j<0 ||i>=grid.length ||j>=grid[0].length || grid[i][j]!='O'){
        return;
       }
    grid[i][j] = '#';
    dfs(grid,i+1,j);
    dfs(grid,i-1,j);
    dfs(grid,i,j+1);
    dfs(grid,i,j-1);
    }
}