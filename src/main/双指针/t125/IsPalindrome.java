package 双指针.t125;

/**
 * @auther: sotowang
 * @date: 2019/11/03 22:06
 */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(left<right){
                if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))){
                    left++;
                    right--;
                }else{
                    return false;
                }
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
