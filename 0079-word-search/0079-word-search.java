class Solution {
    boolean[][]visited;
    public boolean exist(char[][] a, String w) {
        int n = a.length;
        int m = a[0].length;
        visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j] == w.charAt(0) && backTrack(i,j,0,a,w)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean backTrack(int i,int j, int startIndex, char[][]a,String w){
        if(w.length() == startIndex){
            return true;
        }
        if(i<0 || i>=a.length || j<0 || j>=a[i].length||visited[i][j]||a[i][j]!=w.charAt(startIndex)){
            return false;
        }

        visited[i][j] = true;
        if(
            backTrack(i+1,j,startIndex+1,a,w) ||
            backTrack(i-1,j,startIndex+1,a,w) ||
            backTrack(i,j+1,startIndex+1,a,w) ||
            backTrack(i,j-1,startIndex+1,a,w)
        ){
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}