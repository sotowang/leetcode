package 腾讯.t557;

/**
 * @auther: sotowang
 * @date: 2019/12/10 22:06
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String s1 :
                ss) {
            res.append(reverse(s1)).append(" ");
        }
        return res.toString().substring(0,res.length()-1);
    }

    private String reverse(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] sc = s.toCharArray();
        while (start < end) {
            char tem = sc[start];
            sc[start] = sc[end];
            sc[end] = tem;
            start++;
            end--;
        }
        return new String(sc);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(new ReverseWords().reverseWords(s));
    }
}
