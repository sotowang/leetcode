package 常用算法.其它.奇安信;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {
    private static int count = 0;
    public static int CalulateMethodCount (int num_money) {
        if (num_money < 1) {
            return  0;
        }
        int[] dp = new int[num_money + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[num_money];
    }

    private static int dfs(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        } else if (n < m) {
            return dfs(n, n);
        } else if (n == m) {
            return 1 + dfs(n, m - 1);
        } else {
            return dfs(n, m - 1) * dfs(n - m, m);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_money = sc.nextInt();
        System.out.println(CalulateMethodCount(num_money));
    }

}
