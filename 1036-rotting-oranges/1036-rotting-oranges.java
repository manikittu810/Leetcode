class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int freshOranges = 0;

        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    freshOranges++;
                }
            }
        }
        if(freshOranges == 0){
            return 0;//that means grid  contains no oranges(which are not fresh and not rot)
        }

        int time = 0;

        int[][]directions = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };

        while(!q.isEmpty()){
            boolean freshToRot = false;
            int n = q.size();//if you add q.size() at k<n in the below loop , it will behave as dynamic queue size updation which results in uneven calculations of time;
            for(int k=0;k<n;k++){//here everytime this loop starts consider this as one unit of time
                    int []u = q.poll();
                    int i = u[0];
                    int j = u[1];

                    for(int[]direction : directions){
                        int newRow = i + direction[0];
                        int newColumn = j+direction[1];

                        if(newRow>=0 &&
                        newColumn>=0&&
                        newRow<row&&
                        newColumn<col&&
                        grid[newRow][newColumn] == 1){
                            grid[newRow][newColumn] = 2;
                            q.offer(new int[]{newRow,newColumn});
                            freshOranges--;
                            freshToRot = true;
                        }
                    }
            }
            if(freshToRot == true) time++;
        }
        return (freshOranges == 0) ? time : -1;
    }
}