package 二分查找.t50;

/**
 * @auther: sotowang
 * @date: 2019/11/20 19:45
 */
public class MyPow {
    public double myPow(double x, int n) {
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        if (n == -1) {
            return 1 / x;
        }
        double half = myPow(x, n / 2);
        double rest = myPow(x, n % 2);
        return half * rest * half;
    }

    public static void main(String[] args) {
        System.out.println(new MyPow().myPow(3, 3));
        System.out.println(new MyPow().myPow(2, 10));
        System.out.println(new MyPow().myPow(2, -2));
    }
}
