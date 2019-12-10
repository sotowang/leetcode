package 腾讯.t9;

/**
 * @auther: sotowang
 * @date: 2019/12/10 21:19
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverseNum = 0;
        int temp = x;
        while (x != 0) {
            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10;
        }
        return reverseNum == temp;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(121));
        System.out.println(new IsPalindrome().isPalindrome(12));
    }
}
