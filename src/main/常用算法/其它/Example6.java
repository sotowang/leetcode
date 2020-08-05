package 常用算法.其它;

import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/29 20:15
 */
public class Example6 {
    private static int  lucky(int[] nums, int sum) {
        int dif = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i] - sum) <= dif) {
                index = i;
                dif = Math.abs(nums[i] - sum);
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String candidate = sc.next();
        if (candidate.length() > 10) {
            return;
        }
        int[] nums = new int[5];
        String[] names = new String[5];
        for(int i = 0; i < 5; i++){
            String tem = sc.next();
            if (tem.length() > 10) {
                return;
            }
            names[i] =  tem;
            int sum = 0;
            for (int j = 0; j < tem.length();j++) {
                sum += (Character.toLowerCase(tem.charAt(j)) - 'a') + 1;
            }
            nums[i] = sum;
        }
        int sum = 0;
        for (int i = 0; i < candidate.length(); i++) {
            sum += (Character.toLowerCase(candidate.charAt(i)) - 'a') + 1;
        }
        if (nums.length != 5) {
            return;
        }
        int index = lucky(nums, sum);
        System.out.println(names[index]);
    }
}
