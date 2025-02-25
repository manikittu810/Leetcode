class Solution {
    public boolean isValidSudoku(char[][] grid) {
        
        for(int i=0;i<9;i++){
            Set<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(grid[i][j] == '.') continue;
                if(set.contains(grid[i][j])){ 
                    return false;
                }else{
                    set.add(grid[i][j]);
                }
            }
        }

        for(int j=0;j<9;j++){
            Set<Character> set = new HashSet<>();
            for(int i=0;i<9;i++){
                if(grid[i][j] == '.') continue;
                if(set.contains(grid[i][j])){ 
                    return false;
                }else{
                    set.add(grid[i][j]);
                }
            }
        }

        for(int smallGrid = 0;smallGrid < 9 ;smallGrid++){
            Set<Character> smallGridSet = new HashSet<>();
            int i = (smallGrid/3)*3;
            int j =(smallGrid%3)*3;
            for(int row=0;row<3;row++){
                for(int col=0;col<3;col++){
                    int newRow = i+row;
                    int newCol = j+col;
                    if(grid[newRow][newCol] == '.') {
                        continue;
                    }
                    if(smallGridSet.contains(grid[newRow][newCol])) {
                        return false;
                    }else{
                        smallGridSet.add(grid[newRow][newCol]);
                    }

                }
            }
        }
    return true;

    }
}