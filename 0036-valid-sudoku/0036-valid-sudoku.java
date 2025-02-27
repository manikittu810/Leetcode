class Solution {
    public boolean isValidSudoku(char[][] grid) {
	   for(int i=0;i<9;i++){
		Set<Character> set = new HashSet<>();
		for(int j=0;j<9;j++){
			if(set.contains(grid[i][j])){return false;}
			if(grid[i][j]=='.'){continue;}else{
				set.add(grid[i][j]);
			}
		}
	}


	for(int j=0;j<9;j++){
		Set<Character> set = new HashSet<>();
		for(int i=0;i<9;i++){
			if(set.contains(grid[i][j])){return false;}
			if(grid[i][j]=='.'){continue;}else{
				set.add(grid[i][j]);}
		}
	}

	for(int smallGrid=0;smallGrid<9;smallGrid++){
		Set<Character> smallGridSet = new HashSet<>();
		int i = (smallGrid/3)*3;
		int j = (smallGrid%3)*3;
		for(int r = 0;r<3;r++){
			for(int c = 0 ;c<3;c++){
				int newRow = i+r;
				int newCol = j+c;
				if(smallGridSet.contains(grid[newRow][newCol])){
					return false;
				}
				if(grid[newRow][newCol]=='.'){continue;}else{
					smallGridSet.add(grid[newRow][newCol]);
				}
			}
		}
	}
	return true;
    }
}
