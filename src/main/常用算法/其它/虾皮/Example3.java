package 常用算法.其它.虾皮;

import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += (num1.charAt(i--) - '0');
            }
            if (j >= 0) {
                carry += (num2.charAt(j--) - '0');
            }
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }

    }


}
