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
                    bfs(grid,i,j,directions);
                }
            }
        }
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    bfs(grid,i,j,directions);
                    count++;
                }
            }
        }
        return count;
    }
    private void bfs(int[][]grid,int i,int j,int[][]directions){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i,j});
        grid[i][j] = 1;
        while(!q.isEmpty()){
            int n = q.size();
            int []u = q.poll();
            for(int []k:directions){
                int newRow = u[0]+k[0];
                int newCol = k[1]+u[1];
                if(newRow>=0 && newCol>=0
                && newRow<grid.length && newCol<grid[0].length &&grid[newRow][newCol]==0){
                    grid[newRow][newCol] = 1;
                    q.offer(new int[]{newRow,newCol});
                }
            }
        }
    }
}