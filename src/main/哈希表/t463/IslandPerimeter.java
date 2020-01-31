package 哈希表.t463;

/**
 * @auther: sotowang
 * @date: 2020/1/31 20:36
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    for (int k = 0; k < dirs.length; k++) {
                        int m = i + dirs[k][0];
                        int n = j + dirs[k][1];
                        if (m >= 0 && n >= 0 && m < grid.length && n < grid[0].length && grid[m][n] == 0) {
                            perimeter++;
                        } else{
                            if (m < 0) {
                                perimeter++;
                            }
                            if (n < 0) {
                                perimeter++;
                            }
                            if (m >= grid.length) {
                                perimeter++;
                            }
                            if (n >= grid[0].length) {
                                perimeter++;
                            }
                        }
                    }
                }

            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        assert new IslandPerimeter().islandPerimeter(grid) == 16;
    }
}
