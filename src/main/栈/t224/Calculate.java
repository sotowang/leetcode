package 栈.t224;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/12/27 22:02
 */
public class Calculate {
    public int calculate(String s) {
        LinkedList<Character> operateStack = new LinkedList<>();
        LinkedList<Integer> numStack = new LinkedList<>();
        while (!operateStack.isEmpty() || !numStack.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '+' || c == '-') {
                    operateStack.push(c);
                } else if (c != ')') {
                    numStack.push(c);
                } else {
                    char op = operateStack.pop();
                    while (op != '(') {
                        int num1 = numStack.pop() - '0';
                        int num2 = numStack.pop() - '0';
                        if (op == '+') {

                        }
                    }
                }

            }
        }

    }
}
