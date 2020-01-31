package 字符串.t415;

/**
 * @auther: sotowang
 * @date: 2020/1/31 18:14
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += (num1.charAt(i--) - '0');
            }
            if (j >= 0) {
                carry += (num2.charAt(j--) - '0');
            }
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        assert new AddStrings().addStrings("2680", "134").equals("2814");
    }
}
