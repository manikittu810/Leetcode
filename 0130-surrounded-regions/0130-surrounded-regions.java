class Solution {
    private int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public void solve(char[][] board) {
        if(board==null  || board.length==0 || board[0].length == 0) return ;

        int r = board.length;
        int c = board[0].length;

        Queue<int[]> q = new ArrayDeque<>();
        markAndEnqueue(board, r, c, q);
        while(!q.isEmpty()){
            int []u = q.poll();
            for(int []d : directions){
                int newRow = d[0] +u[0];
                int newCol = d[1] + u[1];
                if(
                    newRow>0 && newCol>0 && 
                    newRow<r && newCol<c &&
                    board[newRow][newCol]=='O'
                ){
                    board[newRow][newCol] = 'M';
                    q.offer(new int[]{newRow,newCol});
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if(board[i][j] == 'M'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    private void markAndEnqueue(char[][]board,int r, int c,Queue<int[]>q){
        for(int i=0;i<r;i++){
            if(board[i][0]=='O'){
                board[i][0] = 'M';
                q.offer(new int[]{i,0});
            }
            if(board[i][c-1] == 'O'){
                board[i][c-1] = 'M';
                q.offer(new int[]{i,c-1});

            }
        }

        for(int j=0;j<c;j++){
            if(board[0][j] == 'O'){
                board[0][j] ='M';
                q.offer(new int[]{0,j});
            }
            if(board[r-1][j]=='O'){
                board[r-1][j] = 'M';
                q.offer(new int[]{r-1,j});
            }
        }
    }
}