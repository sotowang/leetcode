package 栈.t20;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/10/29 21:45
 */
public class IsValid {
    public boolean isValid(String s) {
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

    public static void main(String[] args) {
        System.out.println(new IsValid().isValid("["));
    }
}
