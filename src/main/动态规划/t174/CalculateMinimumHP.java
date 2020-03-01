package 动态规划.t174;

/**
 * @auther: sotowang
 * @date: 2020/3/1 20:14
 */
public class CalculateMinimumHP {
    public int calculateMinimumHP(int[][] dungeon) {
        int rows = dungeon.length;
        int cols = dungeon[0].length;
        int[][] dp = new int[rows][cols];
        //最后一个
        dp[rows - 1][cols - 1] = Math.max(1, 1 - dungeon[rows - 1][cols - 1]);
        for (int i = rows - 2; i >= 0; i--) {
            //最后一列
            dp[i][cols - 1] = Math.max(1, dp[i + 1][cols - 1] - dungeon[i][cols - 1]);
        }
        for (int i = cols - 2; i >= 0; i--) {
            //最后一行
            dp[rows - 1][i] = Math.max(1, dp[rows - 1][i + 1] - dungeon[rows - 1][i]);
        }
        //其他值
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = cols - 2; j >= 0; j--) {
                dp[i][j] = Math.max(Math.min(dp[i + 1][j] - dungeon[i][j], dp[i][j + 1] - dungeon[i][j]), 1);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] dungeon = new int[][]{
                {-2, -3, 3},
                {-5, -10, 1},
                {-10, 30, -5},
        };
        assert new CalculateMinimumHP().calculateMinimumHP(dungeon) == 7;
    }
}
