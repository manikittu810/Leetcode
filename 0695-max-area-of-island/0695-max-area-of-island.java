class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][]visited = new boolean[n][m];
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    q.offer(new int[]{i,j});
                    int area = bfs(grid,visited,i,j,n,m,q);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
    private int bfs(int[][]grid,boolean[][]visited,
    int i,int j,int n,int m,Queue<int[]>q){
        visited[i][j] = true;
        int area=1;
        int[][]directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int []cur = q.poll();
            for(int[]d : directions){
                int newRow = d[0]+cur[0];
                int newCol = d[1]+cur[1];
                if(newRow>=0 && newCol>=0 
                && newRow<n && newCol<m 
                && !visited[newRow][newCol] 
                && grid[newRow][newCol]==1){
                    visited[newRow][newCol] = true;
                    q.offer(new int[]{newRow,newCol});
                    area++;
                }
            }
        }
        return area;
    }
}