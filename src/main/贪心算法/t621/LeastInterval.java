package 贪心算法.t621;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/01/09 21:18
 */
public class LeastInterval {
    public int leastInterval(char[] tasks, int n) {
        int[] type = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            type[tasks[i] - 'A']++;
        }
        //将任务数由小到大排序,最大的在type[25]
        Arrays.sort(type);
        int maxCount = type[25];
        //最短时间
        int minTime = (maxCount - 1) * (n + 1) + 1;
        int index = 24;
        //若第二大任务数与最大任务数量相等,则 minTime++
        //(A,3)  (B,2) (C,2) (D,2) ,n=2
        //A _ _ A _ _ A --->A之后逐渐加
        while (index >= 0 && type[index] == maxCount) {
            minTime++;
            index--;
        }
        //如果空位都插满之后还有任务，那就随便在这些间隔里面插入就可以，因为间隔长度肯定会大于n，在这种情况下就是任务的总数是最小所需时间
        return Math.max(minTime, tasks.length);
    }

    public static void main(String[] args) {
        char[] tasks1 = {'A', 'A', 'A', 'B', 'B', 'B'};
        assert new LeastInterval().leastInterval(tasks1, 2) == 8;
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D'};
        assert new LeastInterval().leastInterval(tasks, 2) == 9;

    }
}
