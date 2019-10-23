package 排序.t57;

import java.util.*;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/23 20:45
 */
public class Insert {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0 || intervals[0].length == 0) {
            return new int[0][];
        }
        if (newInterval == null || newInterval.length == 0) {
            return intervals;
        }
        List<int[]> res = new ArrayList<>(Arrays.asList(intervals));
        res.add(newInterval);
        Collections.sort(res, (a, b) -> a[0] - b[0]);



        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        List<int[]> res = new ArrayList<>(Arrays.asList(new int[]{2, 5}));
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i)[0]);

        }
    }
}
