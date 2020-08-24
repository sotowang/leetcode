package 常用算法.其它.爱奇艺;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check(str));

    }
    public static boolean isValid(String s) {
        //若length为奇数,则为false
        if (s == null || s.length() == 0 ) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }

        LinkedList<Character> stack = new LinkedList<>();
        //特例:
        // "[", "]{"
        for (char c : s.toCharArray()
        ) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }

    private static String check(String str) {
        if (isValid(str)) {
            return "True";
        }
        return "False";
    }


}
