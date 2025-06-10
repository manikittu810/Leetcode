class Solution {
    private int R,C;
    public void solve(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0) return ;
        R = board.length;
        C = board[0].length;
        for(int i=0;i<R;i++){
            if(board[i][0]=='O'){
                markItVisited(board,i,0);
            }
            if(board[i][C-1] == 'O'){
                markItVisited(board,i,C-1);
            }
        }
        for(int j=0;j<C;j++){
            if(board[0][j]=='O'){
                markItVisited(board,0,j);
            }
            if(board[R-1][j]=='O'){
                markItVisited(board,R-1,j);
            }
        }

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if(board[i][j]=='M'){
                    board[i][j] = 'O';
                }
            }
        }



        
    }
    private void markItVisited(char[][]board,int curRow,int curCol){
        if(curRow<0 || curCol<0 ||curRow>=R || curCol>=C || board[curRow][curCol]!='O'){
            return;
        }
        board[curRow][curCol] = 'M';
        markItVisited(board,curRow+1,curCol);
        markItVisited(board,curRow-1,curCol);
        markItVisited(board,curRow,curCol+1);
        markItVisited(board,curRow,curCol-1);

    }
}