package 回溯算法.t306;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/1/29 20:29
 */
public class IsAdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        if (num.length() < 3) {
            return false;
        }
        List<String> res = new ArrayList<>();
        return backTrace(num, 0, res);
    }

    private boolean backTrace(String num, int start, List<String> res) {
        if (start == num.length()) {
            return res.size() > 2;
        }
        for (int end = start + 1; end <= num.length(); end++) {
            String val = num.substring(start, end);
            if ((val.length() != 1 && val.charAt(0) == '0')) {
                break;
            }
            String first = res.size() > 1 ? res.get(res.size() - 1) : "";
            String second = res.size() > 1 ? res.get(res.size() - 2) : "";
            int comRes = Integer.MIN_VALUE;
            if (!first.equals("") && !second.equals("")) {
                comRes = addStrings(first, second, val);
                if (comRes < 0) {
                    break;
                }
            }
            res.add(val);
            if ((comRes == 0 || first.equals("") || second.equals("")) && backTrace(num, end, res)) {
                return true;
            }
            res.remove(res.size() - 1);
        }
        return false;
    }

    /**
     * num1+num2 ? num3
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    private int addStrings(String num1, String num2, String num3) {
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
        return sb.reverse().toString().compareTo(num3);

    }

    public static void main(String[] args) {
        assert new IsAdditiveNumber().isAdditiveNumber("121474836472147483648") == true;
        assert new IsAdditiveNumber().isAdditiveNumber("11235813213455890144") == false;
        assert new IsAdditiveNumber().isAdditiveNumber("199100199") == true;
        assert new IsAdditiveNumber().isAdditiveNumber("112358") == true;


    }


}
