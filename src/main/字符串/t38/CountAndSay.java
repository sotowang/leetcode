package 字符串.t38;

/**
 * @auther: sotowang
 * @date: 2019/11/29 21:31
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        //拿到第一个字符
        char begin = s.charAt(0);
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == begin) {
                count++;
            } else {
                res.append(count).append(begin);
                count = 1;
            }
            begin = s.charAt(i);
        }
        res.append(count).append(s.charAt(s.length() - 1));
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(5));
        System.out.println(new CountAndSay().countAndSay(4));
        System.out.println(new CountAndSay().countAndSay(3));
        System.out.println(new CountAndSay().countAndSay(2));
        System.out.println(new CountAndSay().countAndSay(1));
    }
}
