class Solution {
    public int maxAreaOfIsland(int[][] grid) {
         int globalMax = 0;//assigned global value;
        int r = grid.length;//row length
        int c = grid[0].length;//column length

        boolean [][]visited = new boolean[r][c];//visited boolean array for marking 
        Queue<int[]> q = new LinkedList<>();//queue to hold data points where grid[i][j] == 1
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!visited[i][j] && grid[i][j] == 1){// checked whether visited or not and checks whether the grid point is equal to 1.
                    int area = bfs(grid,visited, i, j, r,c,q);// bfs
                    globalMax = Math.max(globalMax,area);
                }
            }
        }
        return globalMax;
    }
    private int bfs(int[][]grid, boolean[][]visited, int i , int j, int r, int c, Queue<int[]> q){
        visited[i][j] = true;
        int area = 1;
        q.offer(new int[]{i,j});// new (x,y) is added to the queue.
        int[][]directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){

            int []a = q.poll();

            for(int[] direction : directions){

                int newRow = direction[0] + a[0];
                int newCol = direction[1] + a[1];

                if(
                    newRow>=0 && newRow <r &&
                    newCol >= 0 && newCol <c &&
                    !visited[newRow][newCol] && 
                    grid[newRow][newCol] == 1
                ){
                        visited[newRow][newCol] = true;
                        q.offer(new int[]{newRow,newCol});
                        area++;
                }
            }
        }
            return area;
        }
}