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
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >=  grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        for (int[] dir :
                dirs) {
            int tem_i = i + dir[0];
            int tem_j = j + dir[1];
            dfs(grid, tem_i, tem_j);
        }
    }

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '1'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(new NumIslands().numIslands(grid));
    }
}
