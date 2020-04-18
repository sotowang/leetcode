package 常用算法.其它;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 extends ClassLoader  {
    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
        int len = requirements.length;
        int[] res = new int[len];
        int day = increase.length;
        Arrays.fill(res,-1);
        for(int i=0;i<len;i++){
            if (requirements[i][0] == 0 && requirements[i][1] == 0 && requirements[i][2] == 0) {
                res[i] = 0;
            }
        }

        int[] sum = new int[3];
        for(int i=0;i<day;i++){
            sum[0] += increase[i][0];
            sum[1] += increase[i][1];
            sum[2] += increase[i][2];
            for(int j=0;j<len;j++){
                if (res[j] == -1 && sum[0] >= requirements[j][0] && sum[1] >= requirements[j][1] && sum[2] >= requirements[j][2]) {
                    res[j] = i + 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] increase = new int[][]{
                {2, 8, 4}, {2, 5, 0}, {10, 9, 8}
        };
        int[][] requirements = new int[][]{
                {2, 11, 3}, {15, 10, 7}, {9, 17, 12}, {8, 1, 14}
        };
        new Example2().getTriggerTime(increase, requirements);
    }
}
