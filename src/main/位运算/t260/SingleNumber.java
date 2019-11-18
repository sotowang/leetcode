package 位运算.t260;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/11/18 20:23
 */
public class SingleNumber {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int n :
                nums
        ) {
            xor ^= n;
        }
        int[] res = new int[2];

        int mask = xor & (-xor);
        for (int n :
                nums) {
            if ((mask & n) == 0) {
                res[0] ^= n;
            } else {
                res[1] ^= n;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2,5};
        int[] res = new SingleNumber().singleNumber(nums);
        Arrays.stream(res).forEach(System.out::println);
        System.out.println(2 ^ 1);
    }

}
