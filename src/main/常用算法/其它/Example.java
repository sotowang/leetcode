package 常用算法.其它;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:22
 */
public class Example {
    private static int one;
    private static int two;
    private static int three;

    private static void solution(String exp) {
        int len = exp.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = exp.charAt(i);
            if (c == ')' || c == '(') {
                sb.append(exp.charAt(i));
            }
        }
        exp = sb.toString();
        len = exp.length();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            char c = exp.charAt(i);
            if (c == '(') {
                stack.push('(');
            } else if (c == ')' && !stack.isEmpty()) {
                one++;
                stack.pop();
            }else if(c == ')'){
                three++;
            }
        }
        while (!stack.isEmpty()) {
            stack.pop();
            two++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        solution("1*2+(3+3)))(((");
        solution(s);
        System.out.println(one + " " + two + " " + three);
    }

}
