package 动态规划.t96;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/10 10:11
 */
public class NumTrees {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        //外层控制的是dp[i]这个位置的值，从2开始;以及内层中i-j，从而求得右子树为根的数目
        for (int i = 2; i <= n; i++) {
            //内层控制的是根从1至i的数目
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new NumTrees().numTrees(3));
    }
}
