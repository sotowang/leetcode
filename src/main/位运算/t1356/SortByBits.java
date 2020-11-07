package 位运算.t1356;

import java.util.Arrays;

/**
 * @author: sotowang
 * @date: 2020/11/07 16:59
 */
public class SortByBits {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr).boxed()
                .sorted((a, b) -> {
                    int count = Integer.bitCount(a) - Integer.bitCount(b);
                    if (count == 0) {
                        return a < b ? -1 : 1;
                    }
                    return count;
                })
                .mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Integer.bitCount(7));
    }
}
