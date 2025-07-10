class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // for row
        for(int i =0;i<9;i++){
            Set<Character> rowSet = new HashSet<>();
            for(int j=0;j<9;j++){
                if(rowSet.contains(board[i][j])) return false;
                if(board[i][j]=='.') continue;
                if(!rowSet.contains(board[i][j])){
                    rowSet.add(board[i][j]);
                }
            }
        }

        //for column
        for(int j=0;j<9;j++){
            Set<Character> colSet = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j] == '.') continue;
                if(colSet.contains(board[i][j])){
                    return false;
                }else{
                    colSet.add(board[i][j]);
                }
            }
        }

        //now check the same for small 3*3 grids

        for(int i=0;i<9;i++){
            Set<Character> smallGrids = new HashSet<>();
                int newRow = (i/3)*3;//9/3 = 3*3 = 9
                int newCol = (i%3)*3;//9%3 = 0*3 = 0
                for(int row = 0;row<3;row++){
                    for(int col=0;col<3;col++){
                        int j = newRow+row;
                        int k = newCol + col;
                        if(board[j][k] == '.') continue;
                if(smallGrids.contains(board[j][k])){
                    return false;
                }else{
                    smallGrids.add(board[j][k]);
                }
                    }
                }
            }
        return true;

        }
        
    }