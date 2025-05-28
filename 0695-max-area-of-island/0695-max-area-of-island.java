class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean [][]visited = new boolean[r][c];
        int max = 0;
        for(int i=0;i<r;i++){
            
            for(int j=0;j<c;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    int area = dfs(grid,visited,i,j,r,c);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
    private int dfs(int[][]grid, boolean [][]visited, int i , int j, int r, int c){
        if(i<0 || i>=r || j<0 || j>=c || visited[i][j] || grid[i][j]!=1){
            return 0;//0 beacuse there's no area here.
        }
        visited[i][j] = true;
        int area=1;
         area+=dfs(grid,visited,i+1,j,r,c);
         area+=dfs(grid,visited,i-1,j,r,c);
         area+=dfs(grid,visited,i,j+1,r,c);
         area+=dfs(grid,visited,i,j-1,r,c);
         return area;
    }
}