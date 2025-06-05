class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(
                    grid[i][j] == 1
                ){count++;}
            }
        }
        if(count == 0){
            return 0;
        }
        int time=0;
        int[][]directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            boolean something = false;
            int n = q.size();
            for(int i = 0;i<n;i++){
            int []u = q.poll();
            for(int []dir : directions){
                int newRow = dir[0]+u[0];
                int newCol = dir[1]+u[1];
                if(newRow>=0 && newRow<r && newCol>=0 
                && newCol<c && grid[newRow][newCol] == 1){
                    grid[newRow][newCol] = 2;
                    q.offer(new int[]{newRow,newCol});
                    count--;
                    something = true;
                }
            }

        }
        if(something==true) time++;
        }

       return count == 0 ? time : -1;
    }
}