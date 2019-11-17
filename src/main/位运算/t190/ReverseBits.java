package 位运算.t190;

/**
 * @auther: sotowang
 * @date: 2019/11/17 19:49
 */
public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            //计算n最右边位
            int right = n >> i & 1;
            res = res | right << (31 - i);
            //计算n最左边位的数
            int left = n >> (31 - i) & 1;
            res = res | left << i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseBits().reverseBits(6));
        System.out.println(Integer.reverse(6));

    }
}
