class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r=0;r<9;r++){
            Set<Character> rSet = new HashSet<>();
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;
                }

                if(rSet.contains(board[r][c])){
                    return false;
                }

                rSet.add(board[r][c]);
            }
        }

        for(int c=0;c<9;c++){
        Set<Character> cSet = new HashSet<>();
        for(int r =0;r<9;r++){
            if(board[r][c] == '.'){
                continue;
            }

            if(cSet.contains(board[r][c])){
                return false;
            }
            cSet.add(board[r][c]);
        }

        }

        for(int smallGrid = 0;smallGrid < 9 ; smallGrid++){
            Set<Character> gridSet = new HashSet<>();
            int i = (smallGrid/3)*3;
            int j = (smallGrid%3)*3;
            for(int r =0;r<3;r++){
                for(int c=0;c<3;c++){
                    int row = i+r;
                    int col = j+c;

                    if(board[row][col] == '.'){
                        continue;
                    }

                    if(gridSet.contains(board[row][col])){
                        return false;
                    }

                    gridSet.add(board[row][col]);
                }
            }
        }
        return true;
    }
}