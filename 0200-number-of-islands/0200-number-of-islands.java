class Solution {
    public int numIslands(char[][] grid) {

        int r = grid.length;
        int c = grid[0].length;

        boolean [][]visited = new boolean[r][c];

        Queue<int[]> queue = new LinkedList<>();

        int[][]directions = {{1,0},{-1,0},{0,1},{0,-1}};

        int count = 0;


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

                if(grid[i][j] == '1' && !visited[i][j]){

                    visited[i][j] = true;

                    queue.offer(new int[]{i,j});

                    count++;

                        while(!queue.isEmpty()){


                        int []u = queue.poll();

                        for(int []direction : directions){

                            int newRow = direction[0]+u[0];
                            int newCol = direction[1]+u[1];

                            if(newRow>=0 && newRow<r 
                            && newCol>=0 && newCol<c
                            && !visited[newRow][newCol] && grid[newRow][newCol] == '1'){

                                visited[newRow][newCol] = true;
                                queue.offer(new int[]{newRow,newCol});

                            }
                        }
                    }
                }
            }
        }
        return count;   
    }
}