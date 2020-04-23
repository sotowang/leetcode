package 常用算法.其它;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    private static String max(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        sum /= k;
        StringBuilder sb = new StringBuilder();
        int subSum = 0;
        int count = 0;
        int index = -1;
        for (int i = 0; i < nums.length - 1 && count < k; i++) {
            if (Math.abs(subSum + nums[i] - sum) > Math.abs(subSum + nums[i] + nums[i + 1] - sum)) {
                subSum += nums[i];
                sb.append(nums[i]).append(" ");
            } else {
                sb.append(nums[i]).append(" / ");
                subSum = 0;
                count++;
            }
            index = i;
        }
        for (int i = index+1; i < nums.length; i++) {
            sb.append(nums[i]).append(" ");
        }
        return sb.toString().trim();
    }



    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] nums = {1, 2, 3, 2, 5, 4};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(max(nums, k));
    }


}
