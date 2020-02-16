package 数学.t233;

/**
 * @auther: sotowang
 * @date: 2020/1/21 18:59
 */
public class CountDigitOne {
    public int countDigitOne(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += lengthOf1(String.valueOf(i));
        }

        return sum;
    }

    /**
     * 计算字符串中1的数量
     * @param s
     * @return
     */
    private int lengthOf1(String s) {
        return s.length() - s.replace("1", "").length();
    }


    public static void main(String[] args) {
        assert new CountDigitOne().countDigitOne(13) == 6;

    }
}
