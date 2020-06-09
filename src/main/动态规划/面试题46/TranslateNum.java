package 动态规划.面试题46;

/**
 * @author: wangsongtao
 * @date: 2020/06/09 20:06
 */
public class TranslateNum {
    public int translateNum(int num) {
        String nums = String.valueOf(num);
        int len  = nums.length();
        int[] dp = new int[len+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=len;i++){
            int n = Integer.valueOf(nums.substring(i-2,i));
            if(n>=10 && n<=25){
                dp[i] = dp[i-1]+dp[i-2];
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[len];
    }
}
