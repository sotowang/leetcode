package 动态规划.编辑距离.面试题01_05;

/**
 * @auther: sotowang
 * @date: 2020/4/15 15:09
 */
public class OneEditAway {
    public boolean oneEditAway(String first, String second) {
        int len1 = first.length();
        int len2 = second.length();
        int[][] dp = new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++){
            dp[i][0] = i;
        }
        for(int i=0;i<=len2;i++){
            dp[0][i] = i;
        }
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(first.charAt(i-1) == second.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(Math.min(dp[i-1][j-1],dp[i][j-1]),dp[i-1][j])+1;
                }
            }
        }
        return dp[len1][len2] <=1;
    }
}
