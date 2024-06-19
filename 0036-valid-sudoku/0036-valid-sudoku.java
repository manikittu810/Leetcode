class Solution {
    public boolean isValidSudoku(char[][] board) {
        //imagine creating HashSet(s) for every row,col and for each 3*3 box in the sudoku
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];


        //Assigning new HashSet for each row,col, 3*3 boxes
        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        //traverse through each cell in the sudoku

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num = board[i][j];

                if(num == '.'){
                    continue;
                }
                if(row[i].contains(num)){
                    return false;
                }
                row[i].add(num);

                if(col[j].contains(num)){
                    return false;
                }
                col[j].add(num);

                int boxIndex = (i/3)*3 + (j/3);
                if(boxes[boxIndex].contains(num)){
                    return false;
                }
                boxes[boxIndex].add(num);
            }
        }
        return true;
    }
}

