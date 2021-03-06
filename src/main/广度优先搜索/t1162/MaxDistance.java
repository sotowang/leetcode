package 广度优先搜索.t1162;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/01/06 21:02
 */
public class MaxDistance {
    public int maxDistance(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return -1;
        }
        LinkedList<int[]> land = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    land.offer(new int[]{i, j});
                }
            }
        }
        if (land.size() == grid.length * grid[0].length || land.size() == 0) {
            return -1;
        }
        int maxDist = -1;
        int[][] directions = {{0, 1}, {-1, 0}, {1, 0}, {0, -1}};
        while (!land.isEmpty()) {
            int count = land.size();
            for (int l = 0; l < count; l++) {
                int[] position = land.poll();
                int i = position[0];
                int j = position[1];
                for (int k = 0; k < directions.length; k++) {
                    int m = i + directions[k][0];
                    int n = j + directions[k][1];
                    if (m >= 0 && n >= 0 && m < grid.length && n < grid[0].length && grid[m][n] == 0) {
                        grid[m][n] = 1;
                        land.offer(new int[]{m, n});
                    }
                }
            }
            maxDist++;
        }
        System.out.println(maxDist);
        return maxDist;
    }

    public static void main(String[] args) {
        int[][] grid2 = new int[][]{
                {0,0,0,0,1,0,1,0,0,0,1,1,0,1,0,0,1,0,1,0,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,0,0,0,1,0,0,0,1,1,1,1,1,0,0,0,1,1,1,1,1,0,0,1,0,1},
                {0,0,0,0,1,0,0,0,1,0,1,0,0,1,1,1,1,0,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,0,1,1,0,1,1,0,1,1,1,0,0,1,0,0,0,1,1,1,1,1,0,1,0,1,0},
                {0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,1,1,0,1,0,0,1,0,0,0,1,1,0,0,0,1,1,1,1,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,0,1,0,1,0,0,1},
                {0,1,1,0,1,1,1,0,0,0,0,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,0,1,0,0,0,0,1,0,1,1,1,1,1,0,0,0,1,0,0,0,1,0,0,0,1,0},
                {1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,0,0,1,0,1,1,1,1,0,0,1,0,0,0,1,1,1,0,0,1,1,0,1,0,0,0,1,0,1,1,1,0,1,1,1,0,1,1,0,0},
                {0,1,0,0,0,0,1,1,1,1,1,0,0,0,1,1,0,0,0,1,1,1,1,0,0,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,1,0,0,1,0,0,1,0,1,1,0,1,0,1,1,1,1,1,1,1},
                {1,0,0,1,1,0,0,1,0,0,0,1,0,1,1,0,0,1,1,1,1,1,0,0,1,1,1,0,0,0,0,0,1,1,0,1,1,1,1,0,0,1,0,1,0,0,0,1,0,0,0,0,1,1,1,0,1,0,1,1},
                {0,1,0,1,1,0,0,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,0,0,1,1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,1,0,0},
                {0,0,0,1,0,0,1,0,1,0,1,0,0,1,1,1,0,0,1,1,0,0,1,0,0,1,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,0,0},
                {1,1,1,1,1,1,0,1,1,1,1,0,0,1,1,1,0,0,1,1,1,0,0,1,1,1,1,0,1,1,1,1,0,1,0,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,1,0,1},
                {0,0,1,0,0,0,0,0,1,1,1,1,1,0,1,0,1,1,1,0,1,1,0,0,1,1,1,0,0,0,1,0,1,1,1,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0},
                {1,1,0,0,1,0,0,1,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,0,0,0,0,1,1,0,1,1,1,1,0,1,0,0,1,1,0,0,0,1,0,0,1,0,1,1,0,0,0,1,1,0,0},
                {1,0,1,1,0,0,1,0,1,0,1,1,1,1,0,0,0,1,1,0,0,1,1,0,1,0,1,0,1,1,0,1,1,0,0,1,1,0,0,0,1,1,0,1,1,1,1,1,0,1,0,0,1,0,0,0,0,1,0,0},
                {0,0,1,0,1,1,1,0,0,0,0,0,1,0,1,1,1,0,1,0,1,1,0,0,0,0,1,0,1,0,0,1,1,1,0,1,1,1,0,0,0,1,1,0,0,0,1,1,1,0,0,0,1,1,1,1,0,0,0,0},
                {1,1,1,1,1,1,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,0,1,0,1,0,1,1,1,0,1,0,0,0,1,1,0,0,1,1,0,1,0,0},
                {0,1,1,0,0,0,0,1,1,0,0,1,1,1,1,1,0,1,1,0,1,0,1,1,1,0,0,1,0,0,1,0,0,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1,0,0,0,0,1,1,1,1,1,0,1,0},
                {1,1,0,0,1,0,1,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,1,0,0,0,1,0,0,1,0,0,0,1,1,0,0,0,0,0,1,0,0,0,1,1,0,1,0,1,0,0,0,0,0,0,0,1,0,1},
                {1,1,0,0,1,0,1,1,1,0,0,1,0,0,1,0,0,0,1,1,1,0,0,0,1,0,1,0,1,0,1,0,0,0,0,1,1,1,1,0,1,1,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,1,0,1},
                {0,0,1,0,1,0,0,0,1,1,0,0,1,0,1,1,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,1,0,1,0,0,1,1,1,0,0,0,0,0,1,0,1,1,0,1,0,1,1,0,1,1,1,1,0,0},
                {0,1,0,1,0,0,1,0,1,1,0,0,0,0,1,0,1,0,0,0,1,0,0,0,1,1,1,1,1,0,0,0,0,1,0,1,1,1,1,1,1,0,1,0,0,0,1,1,1,1,1,0,0,0,0,1,1,0,1,1},
                {0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1,0,1,1,0,0,1,0,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,0,0,1,0,0,1,0,1,1,1,0,1,1,1,0,1,1,0,1,0,1},
                {1,1,1,1,1,1,1,0,0,1,1,0,1,1,0,0,1,1,0,0,1,1,1,1,1,1,1,0,1,0,0,1,0,0,1,1,0,1,0,0,0,1,0,0,1,0,1,0,0,1,0,1,1,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,0,0,0,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,0,1,1,1,0,0,0,0,0,0,1,1,0,0,0,1},
                {0,1,1,0,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,1,0,1,1,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0},
                {0,0,0,0,0,1,1,0,0,1,0,1,0,1,0,0,1,1,1,1,1,1,0,1,0,0,0,0,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,0,1,0,0,1,1,1},
                {0,0,0,0,0,1,0,0,1,1,1,0,1,0,1,1,1,0,0,1,0,0,1,0,1,1,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,1,1,0,0,1,1,1,1,1,0,1,1,1,0,1,0,0,0,1},
                {0,1,0,0,0,1,1,0,1,0,1,0,1,1,1,1,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,1,0,1,1,1,1,1,0,1,1,0,0,0,0,1,1,0,0,0,0,1,1,0,0,1,1,0,1,0},
                {1,1,1,1,1,0,0,0,0,0,0,1,0,0,1,1,1,0,0,0,0,0,0,1,0,1,1,0,1,0,0,1,0,1,1,1,0,0,0,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,0,0,0,0,1},
                {1,1,0,1,1,0,0,1,0,0,1,1,0,1,0,0,0,0,1,1,1,0,1,1,1,1,0,1,1,0,0,1,0,1,0,1,1,1,1,1,0,1,1,0,0,0,0,0,0,0,1,1,0,1,1,1,1,0,0,1},
                {1,0,0,1,0,1,1,0,1,0,1,1,1,0,1,1,1,1,1,1,0,0,0,1,0,0,1,1,0,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,0,1,0,1},
                {1,1,1,0,0,0,1,1,0,0,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,0,1,0,1,0,0,0,1,1,1,0,1,1,1,1,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,1},
                {1,1,0,1,1,1,0,0,1,1,1,0,0,1,0,1,1,0,0,1,0,0,1,0,0,0,1,1,0,1,0,0,1,0,0,0,0,1,1,1,0,1,0,0,1,1,1,1,1,1,1,1,0,0,0,1,0,1,0,1},
                {1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,0,0,0,0,1,1,1,0,1,0,1,0,1,0},
                {1,0,1,0,1,1,0,1,1,0,0,0,0,1,0,1,0,0,1,0,1,0,1,1,0,1,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,0,1,1,0,0,1,1,0,0,1,0,0,0,1,1,0,1,0,1},
                {0,1,0,0,1,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,1,0,1,1,1,0,0,0,0,0,0,1,1,0,1,1,0,0,1,1,1,0,0,0,1,0,1,0,0,1,1,1,1,1,1,1,0,0,0},
                {0,0,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,0,0,1,1,0,1,0,1,0,0,0,1,1,1,1,1,0,1,0,0,0,0,1,1,1,0,0,0,0,0,0,0,1},
                {0,1,1,0,1,0,0,1,0,1,0,1,0,0,1,1,1,0,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,1,0,1,0,0,1,0,1,0,0,0,1,1,1,1,0,0,1},
                {1,1,0,1,0,0,0,1,0,0,0,0,1,0,0,1,0,0,0,1,1,1,1,0,1,1,1,0,1,1,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,0,1,1,0,1,1,1,0,1,1,0,0,1,1,0},
                {1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,1,1,1,0,0,1,0,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0},
                {0,1,0,0,0,0,0,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,0,0,0,0,1,0,1,0,0,0,0,1,0,1,1,0,0,1,1,1,0,1,0,0,0,1,1,0,1,0,1,1,0,0,1,0,1,1},
                {1,1,1,1,1,0,0,1,0,0,1,0,1,1,0,1,1,0,0,0,0,1,1,1,1,0,0,1,1,0,0,0,1,0,1,0,1,1,1,1,1,0,1,1,0,0,1,1,0,0,0,1,0,0,1,0,0,0,0,1},
                {1,1,0,1,0,1,1,0,0,0,1,1,0,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,0,1,0,0,0,0,0,0,1,1,1,1,0,1,1,1,0,0,1,0,1,1,0,0,1,1,1,0,1,0},
                {0,0,0,0,1,1,0,1,0,0,0,1,0,0,1,1,1,0,1,0,0,0,0,1,1,1,0,0,1,1,1,0,1,1,0,0,0,0,0,0,1,0,1,1,0,0,0,0,1,1,0,0,0,1,0,1,0,1,1,0},
                {0,0,0,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0,1,0,0,0,1,0,0,1,0,1,0,1,1,1,1,1,1,0,1,1,0,0,0,1,1,1,0,0,1,1,0,0,1,1,1,0,0,1},
                {1,0,1,1,0,1,0,0,1,1,1,0,1,0,1,1,1,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1,1,1,0,0,1,1,0,1,1,0,0,0,0,0,1,0,0,1,1,1,0,1,1,1},
                {1,1,1,0,0,1,1,0,0,0,1,1,0,1,1,0,0,1,0,1,1,1,1,0,0,1,0,0,1,0,0,1,1,1,0,0,0,0,1,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1},
                {1,1,1,0,0,0,0,1,0,1,0,1,1,0,0,1,1,1,0,0,1,1,0,0,1,1,0,1,1,0,1,1,1,0,1,1,0,1,1,0,0,1,1,0,1,1,0,1,1,1,0,1,1,1,0,0,1,0,1,1},
                {1,1,1,0,0,0,0,0,0,1,0,0,1,1,1,0,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,0,0,0,1,1,0,1,0,0,1,0,0,1,1,1,0,1,0,1,1,1,1,1,1,0,0,1,1,1},
                {1,0,1,0,0,0,0,1,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,0,1,1,0,0,0,1,0,1,1,1,0,1,1,1,1,1,1,0,0,1,0,0,0,0,1,0,0,0,1,1,1,1,0,1,1},
                {1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,0,0,1,1,0,1,0,0,0,0,1,1,1,0,0,0,1,1,1,0,1,0,1,1,1,1,1,1,1,0,0,1,0,1,1,1,0,0,1,1,0,0},
                {0,1,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,0,0,1,1,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,1,1,0,1,1,1,0,1,0,1,1,1,0,0},
                {0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,1,1,0,0,0,0,0,1,1,1,1,0,0,1,0,1,1,1,0,0,1,1,1,0,1,0,1,0,0,0,1,0,1,1,1,0,0,0,1,1,0,0,0,1,0},
                {0,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,1,1,0,1,1,0,1,0,1,0,0,1,1,1,0,1,0,0,0,1,0,0,0,0,0,1,1,1,1,0,1,1,0,0,0,0,1,0,0,0,0,0,0,1},
                {0,1,0,1,0,0,0,1,0,1,1,0,1,0,0,1,0,0,1,1,0,1,1,1,1,0,1,0,0,1,0,0,1,0,0,0,1,1,0,1,1,0,0,0,0,1,1,1,1,0,1,0,0,1,0,1,0,0,0,1},
                {1,1,1,0,1,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,1,1,1,0,0,1,0,0,1,0,0,1,1,0,1,1,0,1,1,0,1,0,0,1,1,1,0,0,1,0,1,0,0},
                {1,1,1,1,0,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,0,1,1,0,1,1,1,1,0,0,1,1,0,0,1,1,1,0,1,0,1,1,0,0,0,0,0,0,0,1,0,0,1,1,1,0,1,0,1,0},
                {0,0,1,1,1,1,0,1,1,0,0,1,1,1,0,1,1,0,0,1,1,1,0,0,0,0,1,1,0,1,1,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0,1,1,1,0,0,1},
                {0,0,0,0,1,1,1,1,0,0,1,1,1,0,0,1,1,1,0,0,0,0,0,1,0,1,1,1,0,1,0,0,0,1,1,0,1,1,0,1,1,0,0,0,0,1,0,1,0,0,0,1,0,1,1,1,1,1,1,0},
                {0,0,0,1,0,1,0,1,1,1,0,1,1,0,0,0,1,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,1,1,0,0,0,1,1,1,0,1,0,0,1,0,0,1,1,1,0},
                {1,0,0,1,0,0,1,0,1,1,0,1,0,0,1,1,1,0,0,1,0,1,1,0,0,0,0,0,1,1,1,0,0,0,1,1,0,1,1,0,1,0,1,1,0,1,1,0,0,0,0,0,1,0,0,1,1,1,1,0}
        };
        assert new MaxDistance().maxDistance(grid2) == 4;
        int[][] grid1 = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        assert new MaxDistance().maxDistance(grid1) == 2;
        int[][] grid = new int[][]{{1, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assert new MaxDistance().maxDistance(grid) == 4;
    }
}
