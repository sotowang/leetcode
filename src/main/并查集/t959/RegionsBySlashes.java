package 并查集.t959;

/**
 * @auther: sotowang
 * @date: 2020/01/12 11:07
 */
public class RegionsBySlashes {

    public int regionsBySlashes(String[] grid) {
        if (grid == null || grid.length == 0) {
            return 1;
        }
        int[][] grid2 = new int[grid.length * 3][grid.length * 3];
        int len = grid.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (grid[i].charAt(j) == '/') {
                    grid2[i * 3][j*3 + 2] = 1;
                    grid2[i * 3 + 1][j * 3 + 1] = 1;
                    grid2[i * 3 + 2][j * 3 + 0] = 1;
                } else if (grid[i].charAt(j) == '\\') {
                    grid2[i * 3][j * 3] = 1;
                    grid2[i * 3 + 1][j * 3 + 1] = 1;
                    grid2[i * 3 + 2][j * 3 + 2] = 1;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < len * 3; i++) {
            for (int j = 0; j < len * 3; j++) {
                if (grid2[i][j] == 0) {
                    res++;
                    dfs(i, j, grid2);
                }
            }
        }
        return res;
    }

    private int[][] dir = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    private void dfs(int i, int j, int[][] grid) {
        //2表示已遍历过
        grid[i][j] = 2;
        for (int k = 0; k < dir.length; k++) {
            int m = i + dir[k][0];
            int n = j + dir[k][1];
            if (m >= 0 && m < grid.length && n >= 0 && n < grid[0].length && grid[m][n] == 0) {
                dfs(m, n, grid);
            }
        }
    }

    public static void main(String[] args) {
        String[] grid2 = {"\\/", "/\\"};
        assert new RegionsBySlashes().regionsBySlashes(grid2) == 4;
        String[] grid1 = {" /", "  "};
        assert new RegionsBySlashes().regionsBySlashes(grid1) == 1;
        String[] grid = {" /", "/ "};
        assert new RegionsBySlashes().regionsBySlashes(grid) == 2;
    }
}

