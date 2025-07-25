class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshOranges = 0;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    freshOranges++;
                }
            }
        }
        int[][]directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int time = 0;
        while(!q.isEmpty()){
            boolean flag = false;
            int k = q.size();
            for(int v=0;v<k;v++){
                int []cur = q.poll();
                for(int[] d : directions){
                    int newRow = d[0]+cur[0];
                    int newCol = d[1]+cur[1];
                    if(newRow>=0 && newCol>=0 &&
                    newRow<n && newCol<m 
                    && grid[newRow][newCol]==1){
                        grid[newRow][newCol] = 2;
                        flag = true;
                        freshOranges--;
                        q.offer(new int[]{newRow,newCol});
                    }
                }
            }
            if(flag == true){
                time++;
            } 
        }
        return (freshOranges==0) ? time : -1;
    }
}