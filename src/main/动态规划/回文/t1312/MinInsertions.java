package 动态规划.回文.t1312;

/**
 * @auther: sotowang
 * @date: 2020/4/26 17:24
 */
public class MinInsertions {
    public int minInsertions(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for(int i=0;i<len;i++){
            dp[i][i] = 1;
        }
        for(int i=len-2;i>=0;i--){
            for(int j= i+1;j<len;j++){
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 2+dp[i+1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return len-dp[0][len-1];
    }
}
