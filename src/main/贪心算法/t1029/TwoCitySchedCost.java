package 贪心算法.t1029;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/01/09 20:19
 */
public class TwoCitySchedCost {
    public int twoCitySchedCost(int[][] costs) {
        if (costs == null || costs.length == 0 || costs[0] == null || costs[0].length == 0) {
            return 0;
        }
        //假设都去B处
        int sum = 0;
        int[] diff = new int[costs.length];
        for (int i = 0; i < costs.length; i++) {
            sum += costs[i][1];
            diff[i] = costs[i][0] - costs[i][1];
        }
        Arrays.sort(diff);
        for (int i = 0; i < costs.length >> 1; i++) {
            sum += diff[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] costs = {
                {10, 20},
                {30, 200},
                {400, 50},
                {30, 20}
        };
        assert new TwoCitySchedCost().twoCitySchedCost(costs) == 110;

    }
}
