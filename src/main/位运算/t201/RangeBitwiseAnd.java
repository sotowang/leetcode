package 位运算.t201;

import org.w3c.dom.ranges.Range;

/**
 * @auther: sotowang
 * @date: 2019/11/17 20:31
 */
public class RangeBitwiseAnd {
    public int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        while (m != n) {
            //m,n不断右移至其相等
            m >>= 1;
            n >>= 1;

            //记录右移次数,即为n的位数
            count++;
        }
        n <<= count;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(5 & 6 & 7 & 8);
        System.out.println(new RangeBitwiseAnd().rangeBitwiseAnd(5, 6));
    }
}
