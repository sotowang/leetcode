package 栈.t224;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/12/27 22:02
 */
public class Calculate {
    public int calculate(String s) {
        LinkedList<Character> operate = new LinkedList<>();
        LinkedList<String> nibolan = new LinkedList<>();
        //中缀表达式转为逆波兰表达式
        // 中序表达式转化为后续表达式
        // 1. 符号优先级大于栈顶元素，则入栈，否则将栈顶优先级高或相等的元素全部出栈，然后入栈
        // 2. 左括号优先级最高，直接入栈
        // 3. 右括号优先级最低，需要将栈顶元素出栈，直到遇到左括号（左括号也需要出栈）

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (c == '(') {
                operate.push(c);
            } else if (c == '+' || c == '-') {
                while (!operate.isEmpty() && operate.peek() != '(') {
                    nibolan.offer(String.valueOf(operate.pop()));
                }
                operate.push(c);
            } else if (c == ')') {
                while (!operate.isEmpty() && operate.peek() != '(') {
                    nibolan.offer(String.valueOf(operate.pop()));
                }
                if (operate.peek() == '(') {
                    operate.pop();
                }
            } else {
                int num = c - '0';
                while (i < s.length() - 1 && isDigit(s.charAt(i + 1))) {
                    num = num * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                nibolan.offer(String.valueOf(num));
            }
        }
        while (!operate.isEmpty()) {
            nibolan.offer(String.valueOf(operate.pop()));
        }
        return calcu(nibolan);
    }

    private boolean isDigit(char c) {
        int num = c - '0';
        if (num >= 0 && num <= 9) {
            return true;
        }
        return false;
    }

    private int calcu(LinkedList<String> nibolan) {
        LinkedList<Integer> stack = new LinkedList<>();
        while (!nibolan.isEmpty()) {
            String token = nibolan.poll();
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        assert new Calculate().calculate("1-(2-3)") == 2;
        assert new Calculate().calculate("1-2-3") == -4;
        System.out.println();
    }
}
