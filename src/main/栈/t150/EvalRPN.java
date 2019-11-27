package 栈.t150;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/11/27 21:06
 */
public class EvalRPN {
    public int evalRPN(String[] tokens) {
        LinkedList<Integer> stack = new LinkedList<>();
        HashMap<String, Integer> map = new HashMap<String, Integer>(){{
            put("+", 1);
            put("-", 2);
            put("*", 3);
            put("/", 4);
        }};
        for (String token :
                tokens) {
            if (map.containsKey(token)) {
                int a = stack.pop();
                int b = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                }
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println(new EvalRPN().evalRPN(tokens1));
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(new EvalRPN().evalRPN(tokens2));
    }
}
