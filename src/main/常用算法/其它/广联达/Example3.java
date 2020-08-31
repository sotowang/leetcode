package 常用算法.其它.广联达;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //LinkedList<Integer> list = new LinkedList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            //list.offer();
        }
        System.out.println(count(nums));
    }

    private static long count(int[] nums) {
        int[] res = new int[nums.length];
        int i = nums.length - 1;
        int j = 0;
        while (i >= 0) {
            int count = 0;
            j = i + 1;
            while (j < nums.length) {
                if (nums[j] < nums[i]) {
                    count++;
                }
                if (nums[j] == nums[i]) {
                    count += res[j];
                    break;
                }
                ++j;
            }
            res[i] = count;
            --i;
        }
        return Arrays.stream(res).sum();
    }


}
