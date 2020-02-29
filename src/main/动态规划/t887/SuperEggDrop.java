package 动态规划.t887;

/**
 * @auther: sotowang
 * @date: 2020/2/29 15:33
 */
public class SuperEggDrop {
    public int superEggDrop(int K, int N) {
        int[][] dp = new int[K + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            //1个鸡蛋时,每一层都尝试
            dp[1][i] = i;
        }
        //从2 eggs开始走
        for (int i = 2; i <= K; i++) {
            for (int j = 1; j <= N; j++) {
                int tMin = Integer.MAX_VALUE;
                for (int k = 1; k <= j; k++) {
                    tMin = Math.min(tMin, 1 + Math.max(dp[i - 1][k - 1], dp[i][j - k]));
                }
                dp[i][j] = tMin;
            }
        }
        return dp[K][N];
    }

    private int dfs(int eggs, int floors) {
        if (eggs == 1 || floors <= 1) {
            return floors;
        }
        int min = floors;
        for (int i = 1; i <= floors; i++) {
            int tMin = Math.max(dfs(eggs, floors - i), dfs(eggs - 1, i - 1));
            min = Math.min(min, 1 + tMin);
        }
        return min;
    }

    public static void main(String[] args) {
        assert new SuperEggDrop().superEggDrop(8, 10000) == 14;
        assert new SuperEggDrop().superEggDrop(2, 6) == 3;
    }
}
