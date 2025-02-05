class Solution {
    public boolean isValidSudoku(char[][] a) {
        for(int i =0;i<9;i++){
            Set<Character> rSet = new HashSet<>();
            for(int j =0;j<9;j++){
                if(a[i][j]=='.') continue;
                if(!rSet.contains(a[i][j])){
                    rSet.add(a[i][j]);
                }else{
                    return false;
                }
            }
        }


        for(int i=0;i<9;i++){
            Set<Character> cSet = new HashSet<>();
            for(int j=0;j<9;j++){
                if(a[j][i] == '.') continue;
                if(!cSet.contains(a[j][i])){
                    cSet.add(a[j][i]);
                }else {
                    return false;
                }
            }
        }

        for(int smallGrids = 0;smallGrids<3;smallGrids++){
            Set<Character> smallGrid = new HashSet<>();
            int i =(smallGrids/3)*3;
            int j = (smallGrids%3)*3;
            for(int r =0;r<3;r++){
                for(int c=0;c<3;c++){
                    int r1 = i+r;
                    int c1 = j+c;
                    if(a[r1][c1]=='.'){
                        continue;
                    }
                    if(!smallGrid.contains(a[r1][c1])){
                        smallGrid.add(a[r1][c1]);
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}