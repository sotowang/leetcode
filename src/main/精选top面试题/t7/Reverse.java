package 精选top面试题.t7;

/**
 * @auther: sotowang
 * @date: 2019/12/08 10:37
 */
public class Reverse {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(new Reverse().reverse(123));
        System.out.println(new Reverse().reverse(-123));
        System.out.println(new Reverse().reverse(120));
    }
}
