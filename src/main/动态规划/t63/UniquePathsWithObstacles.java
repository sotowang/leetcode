package 动态规划.t63;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/08 20:49
 * @description:
 */
public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] path = new int[row][col];
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == 0 ) {
                //当某个大于1的行，该点上方有障碍，或者上方路径为0，则该点路径为0，因为不可达
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
                //当某个大于1的列，该点左方有障碍，或者左方路径为0，则该点路径为0，因为不可达
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

    /**
     * 2020-07-06
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length ==0 || obstacleGrid[0] == null || obstacleGrid[0].length == 0){
            return 0;
        }
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        if(obstacleGrid[0][0] == 0){
            dp[0][0] = 1;
        }
        for(int i=1;i<obstacleGrid.length;i++){
            if(obstacleGrid[i][0] == 0 && obstacleGrid[i-1][0] == 0 && dp[i-1][0] != 0){
                dp[i][0] = 1;
            }
        }
        for(int i=1;i<obstacleGrid[0].length;i++){
            if(obstacleGrid[0][i] == 0 && obstacleGrid[0][i-1] == 0 && dp[0][i-1] != 0){
                dp[0][i] = 1;
            }
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    // System.out.print(dp[i][j] + ",");
                }
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }

    public static void main(String[] args) {
        System.out.println(new UniquePathsWithObstacles().uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println(new UniquePathsWithObstacles().uniquePathsWithObstacles(new int[][]{
                {0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}}));
        System.out.println(new UniquePathsWithObstacles().uniquePathsWithObstacles(new int[][]{{0, 0}}));
        System.out.println(new UniquePathsWithObstacles().uniquePathsWithObstacles(new int[][]{{0, 0}, {1, 1}, {0, 0}}));
    }
}
