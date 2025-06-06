class Solution {
        private int [][]directions = {{1,0},{0,-1},{-1,0},{0,1}};
    public List<List<Integer>> pacificAtlantic(int[][] height) {
        List<List<Integer>> res = new ArrayList<>();

        int r = height.length;
        int c = height[0].length;
        boolean[][]pacific = new boolean[r][c];
        boolean[][]atlantic = new boolean[r][c];

        for(int i = 0;i<r;i++){
            dfs(i,0,height,pacific);
            dfs(i,c-1,height,atlantic);

        }

         for(int i = 0;i<c;i++){
            dfs(0,i,height,pacific);
            dfs(r-1,i,height,atlantic);
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(pacific[i][j]&& atlantic[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
     return res;   
    }
    private void dfs(int i , int j, int [][]height,boolean[][] ocean){
        ocean[i][j] = true;
        for(int []dir : directions){
            int newRow = dir[0] + i;
            int newCol = dir[1] + j;
            if(newRow>=0 && newCol>=0 
            && newRow<height.length&&newCol<height[0].length  &&
            !ocean[newRow][newCol]
            && height[newRow][newCol] >= height[i][j]){
                dfs(newRow,newCol,height,ocean);
            }
        }
    }
}