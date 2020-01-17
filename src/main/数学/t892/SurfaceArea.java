package 数学.t892;

/**
 * @auther: sotowang
 * @date: 2020/01/17 15:05
 */
public class SurfaceArea {
    public int surfaceArea(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int len = grid.length;
        int res = 0;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                //计算grid单个表面积
                res += grid[i][j] * 4 + 2;

                //计算前后左右覆盖部分
                int minArea = 0;
                for (int k = 0; k < dirs.length; k++) {
                    int m = i + dirs[k][0];
                    int n = j + dirs[k][1];
                    if (m >= 0 && n >= 0 && m < len && n < len && grid[m][n] != 0) {
                        minArea += Math.min(grid[i][j], grid[m][n]);
                    }
                }
                res -= minArea;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid3 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        assert new SurfaceArea().surfaceArea(grid3) == 32;
        int[][] grid2 = {{1, 0}, {0, 2}};
        assert new SurfaceArea().surfaceArea(grid2) == 16;
        int[][] grid1 = {{1, 2}, {3, 4}};
        assert new SurfaceArea().surfaceArea(grid1) == 34;
        int[][] grid = {{2}};
        assert new SurfaceArea().surfaceArea(grid) == 10;
    }

}
