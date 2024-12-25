class Solution {
    private int[][] directions = {
        {0,1},{0,-1},{-1,0},{1,0}
    };
    public List<List<Integer>> pacificAtlantic(int[][] grid) {

        List<List<Integer>> res = new ArrayList<>(); 

        int row = grid.length;
        int col = grid[0].length;

        boolean[][]pacific = new boolean[row][col];
        boolean[][]atlantic = new boolean[row][col];

        for(int i=0;i<row;i++){
            dfs(i,0,pacific,grid);
            dfs(i,col-1,atlantic,grid);
        }

         for(int i=0;i<col;i++){
            dfs(0,i,pacific,grid);
            dfs(row-1,i,atlantic,grid);
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
return res;
    }

    private void dfs(int r ,int c, boolean[][]ocean,int[][]grid){
        ocean[r][c] = true;
        for(int[] i : directions){
            int x = i[0]+r;
            int y = i[1]+c;
            if(
                x>=0 && y>=0 &&
                 x<grid.length && y<grid[0].length && 
                !ocean[x][y] && 
                grid[x][y] >= grid[r][c]
            ){
                    dfs(x,y,ocean,grid);
            }
        }
        
    }
}