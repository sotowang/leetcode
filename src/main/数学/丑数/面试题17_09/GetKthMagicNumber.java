package 数学.丑数.面试题17_09;

/**
 * @auther: sotowang
 * @date: 2020/4/28 21:06
 */
public class GetKthMagicNumber {
    public int getKthMagicNumber(int k) {
        int[] dp = new int[k];
        dp[0] = 1;
        int index3 = 0;
        int index5 = 0;
        int index7 = 0;
        for(int i=1;i<k;i++){
            int tem3 = dp[index3]*3;
            int tem5 = dp[index5]*5;
            int tem7 = dp[index7]*7;
            dp[i] = Math.min(tem3>tem5?tem5:tem3,tem7);
            if(tem3<=dp[i]){
                index3++;
            }
            if(tem5<=dp[i]){
                index5++;
            }
            if(tem7<=dp[i]){
                index7++;
            }
        }
        return dp[k-1];
    }
}
