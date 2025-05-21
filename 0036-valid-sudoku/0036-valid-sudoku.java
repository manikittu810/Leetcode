class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }

        for(int j=0;j<9;j++){
            Set<Character> set = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }

        for(int smallGrid=0;smallGrid <9 ;smallGrid++){
            Set<Character> set = new HashSet<>();
            int i = (smallGrid/3) *3;
            int j = (smallGrid%3) *3;

            for(int r = 0;r<3;r++){
                for(int c=0;c<3;c++){
                    int newRow = i+r;
                    int newColumn = j+c;
                    if(board[newRow][newColumn] =='.') continue;
                    if(set.contains(board[newRow][newColumn])) return false;
                    set.add(board[newRow][newColumn]);
                }
            }
        }
        return true;
    }
}