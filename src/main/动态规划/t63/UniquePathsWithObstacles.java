package 动态规划.t63;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/08 20:49
 * @description:
 */
public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] path = new int[row][col];
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == 0 ) {
                if (i > 0 && (obstacleGrid[i - 1][0] == 1 || path[i - 1][0] == 0)) {
                    path[i][0] = 0;
                } else {
                    path[i][0] = 1;
                }
            } else {
                //若有障碍
                path[i][0] = 0;
            }
        }
        for (int i = 0; i < col; i++) {
            if (obstacleGrid[0][i] == 0) {
                if (i > 0 && (obstacleGrid[0][i - 1] == 1 || path[0][i - 1] == 0)) {
                    path[0][i] = 0;
                } else {
                    path[0][i] = 1;

                }
            } else {
                path[0][i] = 0;
            }
        }

        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (obstacleGrid[j][i] != 1) {
                    path[j][i] = path[j - 1][i] + path[j][i - 1];
                } else {
                    path[j][i] = 0;
                }
            }
        }
        return path[row - 1][col - 1];
    }

    public static void main(String[] args) {
        System.out.println(new UniquePathsWithObstacles().uniquePathsWithObstacles(new int[][]{{0,1, 0, 0,0}, {1,0,0, 0, 0}, {0, 0, 0,0,0},{0, 0, 0,0,0}}));
        System.out.println(new UniquePathsWithObstacles().uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println(new UniquePathsWithObstacles().uniquePathsWithObstacles(new int[][]{{0, 0}}));
        System.out.println(new UniquePathsWithObstacles().uniquePathsWithObstacles(new int[][]{{0, 0}, {1, 1}, {0, 0}}));
    }
}
