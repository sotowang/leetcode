package 常用算法.其它;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 extends Example {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//        int[] nums = new int[]{1, 35, 3, 4};
        List<int[]> list = new ArrayList<>();
        int left = 0;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                list.add(new int[]{left, i});
                max = Math.max(i - left + 1, max);
                left = i + 1;
            }
        }
        list.add(new int[]{left, nums.length - 1});
        for (int i = 0; i < list.size() - 1; i++) {
            int[] pos1 = list.get(i);
            int[] pos2 = list.get(i + 1);
            if (pos2[0] + 1 < nums.length && nums[pos1[1]] < nums[pos2[0] + 1]) {
                max = Math.max(max, pos1[1] - pos1[0] + 1 + pos2[1] - pos2[0]);
            }
            if (pos1[1] - 1 >= 0 && nums[pos2[0]] > nums[pos1[1] - 1]) {
                max = Math.max(max, pos1[1] - pos1[0] + 1 + pos2[1] - pos2[0]);
            }
        }
        System.out.println(max);
    }
}
