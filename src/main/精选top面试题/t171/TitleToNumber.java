package 精选top面试题.t171;

/**
 * @auther: sotowang
 * @date: 2019/12/13 16:42
 */
public class TitleToNumber {
    public int titleToNumber(String s) {
        if (s.length() < 2) {
            return s.charAt(0) - 'A' + 1;
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'A' + 1;
            res = res * 26 + temp;
        }
        return res ;
    }

    public static void main(String[] args) {
        System.out.println(new TitleToNumber().titleToNumber("A"));
        System.out.println(new TitleToNumber().titleToNumber("AB"));
        System.out.println(new TitleToNumber().titleToNumber("ZY"));
        System.out.println(new TitleToNumber().titleToNumber("AAA"));
    }
}
