class Solution {
    int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] a) {
        List<List<Integer>> res = new ArrayList<>();

        int r = a.length;
        int c = a[0].length;

        boolean[][]pacific = new boolean[r][c];
        boolean[][]atlantic = new boolean[r][c];

        for(int i=0;i<r;i++){
            dfs(i,0,pacific,a);
            dfs(i,c-1,atlantic,a);
        }
        for(int i = 0;i<c;i++){
            dfs(0,i,pacific,a);
            dfs(r-1,i,atlantic,a);
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
    private void dfs(int r,int c, boolean[][]ocean, int[][]a){
        ocean[r][c] = true;
        for(int[]u:directions){
            int newRow = u[0] + r;
            int newCol = u[1] + c;

            if(newRow>=0 && newCol>=0 &&newRow < a.length 
            && newCol < a[0].length && !ocean[newRow][newCol] 
            && a[newRow][newCol] >= a[r][c]){
                dfs(newRow,newCol,ocean,a);
            }

        }
        
    }
}