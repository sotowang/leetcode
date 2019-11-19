package 二分查找.t29;

/**
 * @auther: sotowang
 * @date: 2019/11/19 19:47
 */
public class Divide {
    public int divide(int dividend, int divisor) {
        int n = 31;
        int res = 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        //判断正负,负数最高位为1,正数最高位为0
        boolean negative = (dividend ^ divisor) < 0;
        long dividendl = Math.abs((long) dividend);
        long divisorl = Math.abs((long) divisor);
        //100/3为例
        //100/2^n >=3时,count++
        while (dividendl >= divisorl) {
            while ((dividendl >> n) < divisorl) {
                n--;
            }
            //100-2^5*3= 4
            dividendl -= divisorl << n;
            //res = 2^5 = 32
            res += 1 << n;
        }
        return negative ? -res : res;
    }

    public static void main(String[] args) {
        System.out.println(new Divide().divide(100, 3));
        System.out.println(new Divide().divide(-100, 3));
        System.out.println(new Divide().divide(-100, -3));
        System.out.println(new Divide().divide(-100, 3));
        System.out.println(new Divide().divide(1, 1));
        System.out.println(new Divide().divide(-2147483648, -1));
    }
}
