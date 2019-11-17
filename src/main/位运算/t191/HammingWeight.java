package 位运算.t191;

/**
 * @auther: sotowang
 * @date: 2019/11/17 20:13
 */
public class HammingWeight {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new HammingWeight().hammingWeight(-3));
    }
}
