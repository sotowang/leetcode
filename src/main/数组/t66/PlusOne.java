package 数组.t66;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/12/05 21:00
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        //进位标志
        int mark = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if ((digits[i] + mark) % 10 == 0) {
                digits[i] = 0;
            } else {
                digits[i]++;
                mark = 0;
                break;
            }
        }
        if (mark == 1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }

    public static void main(String[] args) {
//        int[] digits = {1, 2, 3};
//        Arrays.stream(new PlusOne().plusOne(digits)).forEach(System.out::println);
        int[] digits2 = {9,9};
        Arrays.stream(new PlusOne().plusOne(digits2)).forEach(System.out::println);

    }
}
