class Solution {
    public void solve(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][]directions = {
            {1,0},{-1,0},{0,1},{0,-1}
        };
//step1 : 
        for(int i=0;i<row;i++){
            if(grid[i][0]=='O'){
                bfs(grid,q,i,0,directions);
            }
            if(grid[i][col-1]=='O'){
                bfs(grid,q,i,col-1,directions);
            }
        }

        for(int j=0;j<col;j++){
            if(grid[0][j]=='O'){
                bfs(grid,q,0,j,directions);
            }
            if(grid[row-1][j]=='O'){
                bfs(grid,q,row-1,j,directions);
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
    private void bfs(char[][]grid,Queue<int []>q,int i,int j,int[][]directions){
        grid[i][j] ='#';
        q.offer(new int[]{i,j});
        while(!q.isEmpty()){
            int[]u=q.poll();
            for(int []d : directions){
                int newRow = u[0]+d[0];
                int newCol = u[1]+d[1];
                if(newRow>=0 &&newCol>=0 && newRow<grid.length && newCol<grid[0].length && grid[newRow][newCol]=='O'){
                    grid[newRow][newCol]='#';
                    q.offer(new int[]{newRow,newCol});
                }
            }
        }
    }
}