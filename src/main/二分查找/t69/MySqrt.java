package 二分查找.t69;

import javax.sound.midi.MidiChannel;
import java.util.function.LongFunction;

/**
 * @auther: sotowang
 * @date: 2019/11/20 20:05
 */
public class MySqrt {
    public int mySqrt(int x) {
        long left = 0;
        long right = (long) x;
        while (left <= right) {
            long mid = (left + right) >> 1;
            if (mid * mid == x) {
                right = mid;
                break;
            } else if (mid * mid > x) {
                right = mid - 1;
            } else if (mid * mid < x) {
                left = mid + 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        System.out.println(new MySqrt().mySqrt(8));
        System.out.println(new MySqrt().mySqrt(4));
        System.out.println(new MySqrt().mySqrt(9));
    }
}
