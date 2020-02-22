package 字符串.t680;

/**
 * @auther: sotowang
 * @date: 2020/2/22 15:17
 */
public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isValid(s, left + 1, right) || isValid(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isValid(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        assert new ValidPalindrome().validPalindrome("aba") == true;
        assert new ValidPalindrome().validPalindrome("abca") == true;
    }
}
