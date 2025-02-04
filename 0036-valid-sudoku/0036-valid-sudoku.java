class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row =0;row<board.length;row++){
            Set<Character> rowSet = new HashSet<>();
            for(int col = 0;col<board[0].length;col++){
                if(board[row][col]=='.'){
                    continue;
                }
                else if(rowSet.contains(board[row][col])){
                    return false;
                }else{
                    rowSet.add(board[row][col]);
                }
            }
        }

        for(int col = 0;col<board.length;col++){
            Set<Character> colSet = new HashSet<>();
            for(int row =0;row<9;row++){
                if(board[row][col]=='.'){
                    continue;
                }
                else if(colSet.contains(board[row][col])){
                    return false;
                }else{
                    colSet.add(board[row][col]);
                }
            }
        }

        for(int smallGrid = 0;smallGrid<9;smallGrid++){
            Set<Character> smallGrids = new HashSet<>();
            int i = (smallGrid/3)*3;
            int j =(smallGrid%3)*3;
            for(int r=0;r<3;r++){
                for(int c=0;c<3;c++){
                    int row = i+r;
                    int col = c+j;
                    if(board[row][col] == '.'){
                        continue;
                    }
                    else if(smallGrids.contains(board[row][col])){
                        return false;
                    }
                    else{
                        smallGrids.add(board[row][col]);
                    }
                }
            }
        }
        return true;
    }
}