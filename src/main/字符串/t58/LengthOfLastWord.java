package 字符串.t58;

/**
 * @auther: sotowang
 * @date: 2019/11/30 12:07
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        String[] strings = s.trim().split(" ");
        return strings[strings.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello World"));
    }
}
