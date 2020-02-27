package 深度优先搜索.t695;

/**
 * @auther: sotowang
 * @date: 2020/2/27 20:36
 */
public class MaxAreaOfIsland {
    private int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    /**
     * 计算岛屿的面积
     *
     * @param grid
     * @param row
     * @param col
     * @return
     */
    private int dfs(int[][] grid, int row, int col) {
        grid[row][col] = 0;
        int area = 1;
        for (int i = 0; i < dirs.length; i++) {
            int m = dirs[i][0] + row;
            int n = dirs[i][1] + col;
            if (m < grid.length && n < grid[0].length && m >= 0 && n >= 0 && grid[m][n] == 1) {
                area += dfs(grid, m, n);
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[][] grid1 = new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        assert new MaxAreaOfIsland().maxAreaOfIsland(grid1) == 6;
        int[][] grid = new int[][]{{0}};
        assert new MaxAreaOfIsland().maxAreaOfIsland(grid) == 0;
    }
}
