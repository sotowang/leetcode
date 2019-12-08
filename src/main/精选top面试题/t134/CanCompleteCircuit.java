package 精选top面试题.t134;

/**
 * @auther: sotowang
 * @date: 2019/12/08 20:23
 */
public class CanCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remain = 0;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            remain += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (remain < 0) {
                start = i + 1;
                remain = 0;
            }
        }
        return sum >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(new CanCompleteCircuit().canCompleteCircuit(gas, cost));
    }
}
