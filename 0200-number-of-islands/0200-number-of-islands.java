class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        boolean [][]visited = new boolean[r][c];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == '1'  && ! visited[i][j]){
                    bfs(grid,visited,q,i,j,r,c);
                    count++;
                }
            }
        }
        return count;
    }
    private void bfs(char[][] grid, boolean[][]visited,
    Queue<int[]> q,int i,int j,int r,int c){
        visited[i][j]=true;
        q.offer(new int[]{i,j});
        int[][]directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int []a=q.poll();
            for(int[]direction :directions){
                int newRow = direction[0] + a[0];
                int newCol = direction[1] +a[1];
                if(newRow>=0 && newRow < r &&
                newCol >= 0 && newCol<c &&
                !visited[newRow][newCol] && 
                grid[newRow][newCol]=='1'){
                    visited[newRow][newCol] = true;
                    q.offer(new int[]{newRow,newCol});
                }
            }

        }

    }
}