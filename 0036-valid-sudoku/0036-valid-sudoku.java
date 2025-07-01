class Solution {
    public boolean isValidSudoku(char[][] board) {
        int ROW = board.length;
        int COL = board[0].length;

                    for(int i =0;i<ROW;i++){
                                    Set<Character> s = new HashSet<>();
         for(int j=0;j<COL;j++){
                if(s.contains(board[i][j])){return false;}
                if(board[i][j] =='.'){continue;}
                s.add(board[i][j]);
            }
        }

        for(int j=0;j<COL;j++){
            Set<Character> s = new HashSet<>();
            for(int i =0;i<ROW;i++){
                if(s.contains(board[i][j])){return false;}
                if(board[i][j] =='.'){continue;}
                s.add(board[i][j]);
                } 
            }

        for(int smallGrid=0;smallGrid<9;smallGrid++){
            Set<Character> smallGrids = new HashSet<>();
                int i = (smallGrid/3)*3;
                int j = (smallGrid%3)*3;
                for(int r=0;r<3;r++){
                    for(int c=0;c<3;c++){
                        int newR = i+r;
                        int newC = j+c;
                        if(smallGrids.contains(board[newR][newC])){
                            return false;
                        }
                        if(board[newR][newC]=='.'){continue;}
                        if(!smallGrids.contains(board[newR][newC])){smallGrids.add(board[newR][newC]);}
                    }
                }
            }
        return true;

        }
    }