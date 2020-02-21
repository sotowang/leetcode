package 位运算.t371;

/**
 * @auther: sotowang
 * @date: 2020/2/21 15:11
 */
public class GetSum {
    public int getSum(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;
        if (carry != 0) {
            return getSum(sum, carry);
        }
        return sum;
    }

    public static void main(String[] args) {
        assert new GetSum().getSum(-2, 3) == 1;
        assert new GetSum().getSum(1, 2) == 3;
    }
}
