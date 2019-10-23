package 排序.t56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/23 20:45
 */
public class Merge {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0 || intervals[0].length == 0) {
            return new int[0][0];
        }
        List<int[]> res = new ArrayList<>();
        //对数组由小到大排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int right = intervals[0][1];
        int left = intervals[0][0];
        for (int i = 0; i < intervals.length - 1; i++) {
            //此时有区别重叠
            if (right >= intervals[i + 1][0]) {
                //int[][] array = new int[][]{{4, 5}, {2, 3}, {6, 7}, {8, 9}, {1, 10}};
                //若不比较两次,则10会被丢弃
                right = Math.max(Math.max(intervals[i][1], intervals[i + 1][1]),right);
            } else {
                res.add(new int[]{left, right});
                left = intervals[i + 1][0];
                right = intervals[i + 1][1];
            }
        }
        res.add(new int[]{left, right});
        return res.toArray(new int[1][]);

    }

    public static void main(String[] args) {
//        int[][] array = new int[][]{{8, 10}, {1, 3}, {2, 6}, {15, 18}};
//        int[][] array = new int[][]{{1, 4}, {4, 5}};
//        int[][] array = new int[][]{{1, 4}, {2, 3}};
        int[][] array = new int[][]{{4, 5}, {2, 3}, {6, 7}, {8, 9}, {1, 10}};
        int[][] res = new Merge().merge(array);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + "," + res[i][1]);
        }
    }
}
