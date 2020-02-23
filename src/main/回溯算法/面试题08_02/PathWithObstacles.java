package 回溯算法.面试题08_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/22 15:31
 */
public class PathWithObstacles {
    private List<List<Integer>> res = new ArrayList<>();
    private int[][] dirs = new int[][]{{0, 1}, {1, 0}};
    public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null
                || obstacleGrid.length == 0
                || obstacleGrid[0] == null
                || obstacleGrid[0].length == 0
                || obstacleGrid[0][0] == 1
                || obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1) {
            return new ArrayList<>();
        }
        res.add(Arrays.asList(0, 0));
        return backTrace(obstacleGrid, 0, 0) ? res : new ArrayList<>();
    }

    private boolean backTrace(int[][] obstacleGrid, int row, int col) {
        if (row == obstacleGrid.length - 1 && col == obstacleGrid[0].length - 1) {
            return true;
        }
        for (int i = 0; i < dirs.length; i++) {
            int m = row + dirs[i][0];
            int n = col + dirs[i][1];
            res.add(Arrays.asList(m, n));
            if (m < obstacleGrid.length && n < obstacleGrid[0].length && obstacleGrid[m][n] == 0 && backTrace(obstacleGrid, m, n)) {
                return true;
            }
            res.remove(res.size() - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] obstacleGrid4 = new int[][]{
                {1,0}
        };
        System.out.println(new PathWithObstacles().pathWithObstacles(obstacleGrid4));
        int[][] obstacleGrid3 = new int[][]{
                {1}
        };
        System.out.println(new PathWithObstacles().pathWithObstacles(obstacleGrid3));
        int[][] obstacleGrid2 = new int[][]{
                {0, 1}
        };
        System.out.println(new PathWithObstacles().pathWithObstacles(obstacleGrid2));
        int[][] obstacleGrid1 = new int[][]{
                {0, 1},
                {1, 0}
        };
        System.out.println(new PathWithObstacles().pathWithObstacles(obstacleGrid1));

        //[[0, 0], [0, 1], [0, 2], [1, 2], [2, 2]]
        int[][] obstacleGrid = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.println(new PathWithObstacles().pathWithObstacles(obstacleGrid));
    }
}
