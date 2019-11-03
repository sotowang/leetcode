package 双指针.t125;

/**
 * @auther: sotowang
 * @date: 2019/11/03 22:06
 */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int low = 0;
        int high = s.length() - 1;
        s = s.toLowerCase();
        while (low <= high) {
            while (low <= high && !Character.isLetterOrDigit(s.charAt(low))) low++;
            while (low <= high && !Character.isLetterOrDigit(s.charAt(high))) high--;
            if (low > high) {
                return true;
            }
            if (s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(new IsPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(new IsPalindrome().isPalindrome("race a car"));
        System.out.println(new IsPalindrome().isPalindrome(" "));
    }
}
