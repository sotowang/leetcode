package 字符串.t227;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/12/01 19:24
 */
public class Calculate {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        LinkedList<Integer> numStack = new LinkedList<>();
        LinkedList<Character> opStack = new LinkedList<>();
        String sr = s.replace(" ", "");
        for (int i = 0; i < sr.length(); i++) {
            if (sr.charAt(i) == '+' || sr.charAt(i) == '-') {
                opStack.push(sr.charAt(i));
                continue;
            }
            if (sr.charAt(i) == '*' || sr.charAt(i) == '/') {
                int num1 = numStack.pop();
                int num2 = sr.charAt(i + 1) - '0';
                if (sr.charAt(i) == '*') {
                    numStack.push(num1 * num2);
                } else {
                    numStack.push(num1 / num2);
                }
                i++;
                continue;
            }
            //是一个操作数,进栈
            if (sr.charAt(i) - '0' >= 0 && sr.charAt(i) - '0' <= 9) {
                String s1 = sr.charAt(i) + "";
                while (i < sr.length() - 1 && sr.charAt(i + 1) - '0' >= 0 && sr.charAt(i + 1) - '0' <= 9) {
                    s1 += sr.charAt(i + 1);
                    i++;
                }
                numStack.push(Integer.valueOf(s1));
                continue;
            }
        }
        int res = 0;
        while (!numStack.isEmpty()) {
            for (int i = numStack.size()-1; i >= 0; i--) {
                char op1 = opStack.getLast();
                opStack.remove(opStack.size() - 1);
                int num1 = numStack.get(i);
                int num2 = numStack.get(i - 1);
                if (op1 == '+') {
                    res = num1 + num2;
                } else {
                    res = num1 - num2;
                }
                numStack.push(res);
                i--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Calculate().calculate("1-2+1"));
        System.out.println(new Calculate().calculate("0-2147483647"));
        System.out.println(new Calculate().calculate("1-1+1"));
        System.out.println(new Calculate().calculate("1+1+1"));
        System.out.println(new Calculate().calculate(" 3+5 / 2 "));
        System.out.println(new Calculate().calculate(" 3/2 "));
        System.out.println(new Calculate().calculate("3+2*2"));
    }
}
