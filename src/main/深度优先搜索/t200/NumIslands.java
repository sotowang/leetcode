package 深度优先搜索.t200;

/**
 * @auther: sotowang
 * @date: 2019/11/13 21:00
 */
public class NumIslands {
    //方向
    private int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        dfs(grid, 0, 0);

    }

    private int dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        grid[i][j] = 0;
        for (int k = 0; k < dirs.length; k++) {
            int tem_i =
        }

    }
}
