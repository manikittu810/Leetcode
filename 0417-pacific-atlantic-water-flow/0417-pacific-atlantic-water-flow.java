class Solution {
    int[][]directions = {{1,0},{-1,0},{0,-1},{0,1}};
    public List<List<Integer>> pacificAtlantic(int[][] h) {
        List<List<Integer>> res = new ArrayList<>();
        int r= h.length;
        int c= h[0].length;
        boolean[][]pacific = new boolean[r][c];
        boolean[][]atlantic = new boolean[r][c];

        for(int i=0;i<r;i++){
            dfs(i,0,pacific,h);
            dfs(i,c-1,atlantic,h);
        }

        for(int i=0;i<c;i++){
            dfs(0,i,pacific,h);
            dfs(r-1,i,atlantic,h);
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    private void dfs(int i,int j, boolean[][]ocean,int[][]h){
        ocean[i][j] = true;
        for(int[]dir : directions){
        int newRow = dir[0]+i;
        int newCol = dir[1]+j;
        if(newRow>=0 && newCol>=0 && newRow<h.length && newCol<h[0].length&&!ocean[newRow][newCol] && h[newRow][newCol]>=h[i][j]
        ){
            dfs(newRow,newCol,ocean,h);
        }
        }
    }
}