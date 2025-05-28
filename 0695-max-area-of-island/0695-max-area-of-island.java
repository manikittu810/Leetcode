class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean [][]visited = new boolean[r][c];
        int max = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    q.offer(new int[]{i,j});
                    int area = bfs(grid,visited,i,j,r,c,q);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
    private int bfs(int[][]grid, boolean [][]visited, int i , int j, int r, int c,Queue<int[]>q){
        visited[i][j] = true;
        int area = 1;
        int[][]directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int []a = q.poll();
            for(int[]direction : directions){
                int newRow = direction[0] + a[0];
                int newCol = direction[1] + a[1];
                if(newRow>=0 && newRow<r &&
                newCol>=0 && newCol<c &&
                !visited[newRow][newCol] && grid[newRow][newCol]==1){
                    visited[newRow][newCol] = true;
                    q.offer(new int[]{newRow,newCol});
                    area++;
                }
            }
        }
        return area;
    }
}