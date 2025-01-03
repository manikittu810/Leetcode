class Solution {
    public int numEnclaves(int[][] grid) {
        if(grid == null||grid.length==0){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int[][]directions = {{1,0},{-1,0},{0,-1},{0,1}};
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i==0 || i==row-1 || j==0||j==col-1)
                 && grid[i][j]==1){
                    bfs(grid,i,j,directions);
                }
            }
        }
        int count =0;
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    private void bfs(int[][]grid,int row,int col,int[][]directions){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{row,col});
        grid[row][col] = 0;

        while(!q.isEmpty()){

            int []u = q.poll();
            for(int [] i : directions){
                int newRow = i[0]+u[0];
                int newCol = i[1]+u[1];
                if(newRow>=0 && newCol>=0 && newCol<grid[0].length && 
                newRow <grid.length && grid[newRow][newCol]==1){
                    q.offer(new int[]{newRow,newCol});
                    grid[newRow][newCol]=0;
                                    }
            }
        }

    }
}