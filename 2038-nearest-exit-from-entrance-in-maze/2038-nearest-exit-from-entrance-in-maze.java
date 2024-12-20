class Solution {
    public int nearestExit(char[][] grid, int[] e) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] directions = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0}
        };

        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '+') {
                    visited[i][j] = true; 
                }
            }
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{e[0], e[1]});
        visited[e[0]][e[1]] = true;

        int steps = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            for (int k = 0; k < n; k++) {
                int[] u = q.poll();
                int i = u[0];
                int j = u[1];

                for (int[] d : directions) {
                    int newRow = i + d[0];
                    int newCol = j + d[1];

                    if (
                        newRow >= 0 && newRow < row &&
                        newCol >= 0 && newCol < col &&
                        !visited[newRow][newCol]
                    ) {
                        if (
                            (newRow == 0 || newRow == row - 1 || 
                             newCol == 0 || newCol == col - 1) && 
                             !(newRow == e[0] && newCol == e[1])
                        ) {
                            return steps + 1;
                        }

                        visited[newRow][newCol] = true;
                        q.offer(new int[]{newRow, newCol});
                    }
                }
            }
            steps++; 
        }

        return -1;
    }
}
