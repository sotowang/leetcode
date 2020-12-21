package 动态规划.t746;

/**
 * @author: sotowang
 * @date: 2020/12/21 15:27
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        for(int i=2;i<cost.length;i++){
            cost[i] += Math.min(cost[i-2],cost[i-1]);
        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}
