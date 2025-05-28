class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count =0;
        boolean [][]visited = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid, visited,r,c,i,j);
                    count++;
                }
            } 
        }
        return count;
    }

private void dfs(char[][]grid, boolean[][]visited, int r,int c,int i, int j){
        if(i<0 || j<0 || i>=r || j>=c || visited[i][j] || grid[i][j] == '0'){
            return ;
            }
            visited[i][j] = true;
            dfs(grid,visited,r,c,i+1,j);
            dfs(grid,visited,r,c,i-1,j);
            dfs(grid,visited,r,c,i,j+1);
            dfs(grid,visited,r,c,i,j-1);

    }
}
