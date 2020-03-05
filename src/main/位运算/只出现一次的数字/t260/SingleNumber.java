package 位运算.只出现一次的数字.t260;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @auther: sotowang
 * @date: 2019/11/18 20:23
 */
public class SingleNumber {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        int[] res = new int[set.size()];
        int index = 0;
        while (iterator.hasNext()) {
            res[index++] = iterator.next();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] res = new SingleNumber().singleNumber(nums);
        Arrays.stream(res).forEach(System.out::println);
        System.out.println(2 ^ 1);
    }

}
