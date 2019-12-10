package 腾讯.t344;

import 精选top面试题.t7.Reverse;

/**
 * @auther: sotowang
 * @date: 2019/12/10 22:00
 */
public class ReverseString {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        new ReverseString().reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
    }
}
