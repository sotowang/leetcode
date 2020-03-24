package 滑动窗口.面试题17_18;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/24 15:53
 */
public class ShortestSeq {
    public int[] shortestSeq(int[] big, int[] small) {
        HashMap<Integer, Integer> map = new HashMap();
        HashSet<Integer> temSet = new HashSet<>();
        for (int i = 0; i < small.length; i++) {
            map.put(small[i], 0);
        }
        for (int i = 0; i < big.length; i++) {
            if (map.containsKey(big[i])) {
                map.put(big[i], map.get(big[i]) + 1);
                temSet.add(big[i]);
            }
        }
        if (temSet.size() != small.length) {
            return new int[]{};
        }
        int[] res = new int[2];
        for (int i = 0; i < big.length; i++) {
            if (!map.containsKey(big[i])) {
                continue;
            }
            int cnt = map.get(big[i]);
            if (cnt == 0) {
                return res;
            }
            map.put(big[i], cnt - 1);
            temSet.clear();
            temSet.add(big[i]);
            int end = i;
            for (int j = i + 1; j < big.length && temSet.size() < small.length; j++) {
                if (map.containsKey(big[j])) {
                    end = j;
                    temSet.add(big[j]);
                }
            }
            if (temSet.size() == small.length) {
                if ((res[0] == 0 && res[1] == 0) || res[1] - res[0] > end - i) {
                    res[0] = i;
                    res[1] = end;
                } else if (res[1] - res[0] == end - i && res[0] > i) {
                  res[0] = i;
                  res[1] = end;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //[878982, 143504, 268583, 394343, 849567, 257687, 352256, 35131, 663529, 543027]
        //[143504]
        int[] big2 = new int[]{878982, 143504, 268583, 394343, 849567, 257687, 352256, 35131, 663529, 543027};
        int[] small2 = new int[]{143504};
        int[] res2 = new ShortestSeq().shortestSeq(big2, small2);
        Arrays.stream(res2).forEach(System.out::print);
        System.out.println();

        int[] big1 = new int[]{1, 2, 3};
        int[] small1 = new int[]{1, 2, 3};
        int[] res1 = new ShortestSeq().shortestSeq(big1, small1);

        Arrays.stream(res1).forEach(System.out::print);

        System.out.println();
        int[] big = new int[]{7, 5, 9, 0, 2, 1, 3, 5, 7, 9, 1, 1, 5, 8, 8, 9, 7};
        int[] small = new int[]{1, 5, 9};
        int[] res = new ShortestSeq().shortestSeq(big, small);
        Arrays.stream(res).forEach(System.out::println);
    }
}
