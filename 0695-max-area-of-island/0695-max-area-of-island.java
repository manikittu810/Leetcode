class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int globalMax = 0;


        Queue<int[]> q = new LinkedList<>();
        boolean [][]visited = new boolean[row][col];
        int[][]directions = {
            {0,-1},{0,1},{-1,0},{1,0}
        };

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                visited[i][j] = true;

                if(grid[i][j] == 1){
                    

                    int localMax = 1;

                    q.offer(new int[]{i,j});

                    while(!q.isEmpty()){

                        int []u = q.poll();
                        int celli = u[0];
                        int cellj = u[1];

                        for(int []dist: directions){
                            int newRow = celli+dist[0];
                            int newCol = cellj+dist[1];

                            if(newRow>=0 && newRow<row &&
                            newCol>=0 && newCol<col && 
                            grid[newRow][newCol] == 1 
                            &&!visited[newRow][newCol]){
                            visited[newRow][newCol] = true;
                            q.offer(new int[]{newRow,newCol});
                            localMax++;
                        }
                    }
                }
                globalMax = Math.max(localMax,globalMax);
            }
        }
    }
        return globalMax;
}
}