package 动态规划.t983;

/**
 * @auther: sotowang
 * @date: 2020/05/06 16:56
 */
public class MincostTickets {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp =new int[366];
        final int n = 365;
        int dayFee = costs[0];
        int weekFee = costs[1];
        int monthFee = costs[2];
        for(int i=0;i<days.length;i++){
            dp[days[i]] = -1;
        }
        for(int i=1;i<=n;i++){
            if(dp[i] ==0 ){
                dp[i] = dp[i-1];
            }else{
                int dayCost = dp[Math.max(0,i-1)]+dayFee;
                int weekCost= dp[Math.max(0,i-7)]+weekFee;
                int monthCost = dp[Math.max(0,i-30)]+monthFee;
                dp[i] = Math.min(dayCost>weekCost?weekCost:dayCost,monthCost);
            }
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int[] days = {1, 4, 6, 7, 8, 20};
        int[] costs = {2, 7, 15};
        new MincostTickets().mincostTickets(days, costs);
    }
}
