class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count =0;
        boolean [][]visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    bfs(q,count,visited,grid,i,j,n,m);
                    count++;
                }
            }
        }
        return count;
    }
    private void bfs(Queue<int[]> q,int count,boolean[][]visited,char[][]grid,int i,int j,int r,int c){
            visited[i][j] = true;
            q.offer(new int[]{i,j});
            int[][]directions = {{-1,0},{1,0},{0,1},{0,-1}};
            while(!q.isEmpty()){
                int[] cur = q.poll();
                for(int[]d : directions){
                    int newRow = d[0]+cur[0];
                    int newCol = d[1]+cur[1];
                    if(newRow>=0 && newCol>=0 && newRow<r 
                    && newCol<c && !visited[newRow][newCol] &&
                    grid[newRow][newCol]=='1'){
                        visited[newRow][newCol] = true;
                        q.offer(new int[]{newRow,newCol});
                    }
                }
            }
    }
}