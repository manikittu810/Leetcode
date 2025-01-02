class Solution {
    public int numEnclaves(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;

        // Directions for moving up, down, left, right
        int[][] directions = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
        };

        // Flood-fill from the boundary
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Check only boundary cells
                if ((i == 0 || i == rows - 1 || j == 0 || j == cols - 1) && grid[i][j] == 1) {
                    bfs(grid, i, j, directions);
                }
            }
        }

        // Count remaining land cells
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    private void bfs(int[][] grid, int row, int col, int[][] directions) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {row, col});
        grid[row][col] = 0; // Mark as visited

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int[] dir : directions) {
                int newRow = current[0] + dir[0];
                int newCol = current[1] + dir[1];
                if (newRow >= 0 && newCol >= 0 && newRow < grid.length && newCol < grid[0].length && grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = 0; // Mark as visited
                    queue.offer(new int[] {newRow, newCol});
                }
            }
        }
    }
}
