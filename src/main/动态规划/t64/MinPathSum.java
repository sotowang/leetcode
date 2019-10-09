package 动态规划.t64;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/09 16:45
 * @description:
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    grid[j][0] += grid[j - 1][0];
                    continue;
                }
                if (j == 0) {
                    grid[0][i] += grid[0][i - 1];
                    continue;
                }
                grid[j][i] += Math.min(grid[j - 1][i], grid[j][i - 1]);
            }
        }
        return grid[row - 1][col - 1];
    }

    public static void main(String[] args) {
        System.out.println(new MinPathSum().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
}
