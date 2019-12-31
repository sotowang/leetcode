package 数组.t1128;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2019/12/31 16:04
 */
public class NumEquivDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < dominoes.length; i++) {
            int val = Math.min(dominoes[i][0] * 10 + dominoes[i][1], dominoes[i][1] * 10 + dominoes[i][0]);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            count += value * (value - 1) / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] dominoes1 = {{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        assert new NumEquivDominoPairs().numEquivDominoPairs(dominoes1) == 3;
        System.out.println();
        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        assert new NumEquivDominoPairs().numEquivDominoPairs(dominoes) == 1;
        System.out.println();
    }
}
