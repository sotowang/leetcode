package 贪心算法.t1353;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @auther: sotowang
 * @date: 2020/2/16 18:09
 */
public class MaxEvents {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> (a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]));
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < events.length; i++) {
            for (int j = events[i][0]; j <= events[i][1]; j++) {
                if (!set.contains(j)) {
                    set.add(j);
                    break;
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[][] events3 = {{1, 1}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}};
        assert new MaxEvents().maxEvents(events3) == 7;
        int[][] events2 = {{1,100000}};
        assert new MaxEvents().maxEvents(events2) == 1;
        int[][] events1 = {{1, 2}, {2, 3}, {3, 4}};
        assert new MaxEvents().maxEvents(events1) == 3;
        int[][] events = {{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        assert new MaxEvents().maxEvents(events) == 4;
    }
}
