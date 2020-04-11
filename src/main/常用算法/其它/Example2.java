package 常用算法.其它;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 extends Example implements Cloneable {
    private static int count = 0;
    private static void backTrace(long[] nums, long mod, ArrayList<Long> list, long sum, int start) {
        if (sum != 0 && sum % mod == 0) {
            count++;
        }
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            backTrace(nums, mod, list, (sum + nums[i])%mod, i + 1);
            list.remove(list.size() - 1);
            break;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        long mod = sc.nextLong();
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextLong();
        }
        for (int i = 0; i < nums.length; i++) {
            backTrace(nums, mod, new ArrayList<>(), 0l, i);
        }

        System.out.println(count);
    }
}
