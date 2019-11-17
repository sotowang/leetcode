package 位运算.t231;

/**
 * @auther: sotowang
 * @date: 2019/11/17 21:36
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfTwo().isPowerOfTwo(1));
        System.out.println(new IsPowerOfTwo().isPowerOfTwo(2));
        System.out.println(new IsPowerOfTwo().isPowerOfTwo(3));
    }
}
