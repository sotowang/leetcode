package 栈.t1111;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/01/15 17:14
 */
public class MaxDepthAfterSplit {
    public int[] maxDepthAfterSplit(String seq) {
        if (seq == null || seq.length() == 0) {
            return new int[]{};
        }
        int len = seq.length();
        int[] res = new int[len];
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty()) {
                stack.push(0);
                continue;
            }
            if (seq.charAt(i) == '(') {
                stack.push(stack.peek() == 1 ? 0 : 1);
                res[i] = stack.peek();
            } else {
                res[i] = stack.pop();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res1 = new MaxDepthAfterSplit().maxDepthAfterSplit("()(())()");
        Arrays.stream(res1).forEach(e -> System.out.print(e + " "));

        System.out.println();
        int[] res = new MaxDepthAfterSplit().maxDepthAfterSplit("(()())");
        Arrays.stream(res).forEach(e -> System.out.print(e + " "));
    }
}
