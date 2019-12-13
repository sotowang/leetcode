package 精选top面试题.t172;

/**
 * @auther: sotowang
 * @date: 2019/12/13 19:43
 */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new TrailingZeroes().trailingZeroes(30));
        System.out.println(new TrailingZeroes().trailingZeroes(10));
        System.out.println(new TrailingZeroes().trailingZeroes(5));

    }
}
