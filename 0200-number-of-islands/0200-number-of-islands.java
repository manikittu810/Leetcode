class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        Queue<int[]> q = new LinkedList<>();
        int count = 0;
         int[][]directions = {
            {1,0},{0,1},{0,-1},{-1,0}
        };
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]== '1' && !visited[i][j]){
                    visited[i][j]=true;
                    q.offer(new int[]{i,j});
                    count++;
            
        while(!q.isEmpty()){
            int n = q.size();
            for(int k=0;k<n;k++){
                int []u = q.poll();
                int s =u[0];
                int m =u[1];
                for(int []dist : directions){
                    int newRow = s+dist[0]; 
                    int newCol = m+dist[1];
                    if(
                    newRow>=0 && newCol>=0 && newRow<row && newCol<col &&
                    grid[newRow][newCol]=='1' &&
                    !visited[newRow][newCol] 
                    ){
                        visited[newRow][newCol] = true;
                        q.offer(new int[]{newRow,newCol});
                    }
                }
            }
        }
                }
            }
        }
return count;
    }
}