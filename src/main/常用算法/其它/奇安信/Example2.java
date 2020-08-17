package 常用算法.其它.奇安信;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> stack = new LinkedList<>();
        LinkedList<String> undoStack = new LinkedList<>();
        String ss = sc.nextLine();
        ss = ss.replaceAll("\t", " ");
        String[] strs = ss.split(" ");
        for (int i = 0; i < strs.length; i++) {
            String tem = strs[i];
            if (tem.equals("undo")) {
                if (!stack.isEmpty()) {
                    undoStack.push(stack.pop());
                }
            } else if (tem.equals("redo")) {
                if (!undoStack.isEmpty()) {
                    stack.push(undoStack.pop());
                }
            } else {
                stack.push(tem);
            }
        }
        String res = "";
        while (!stack.isEmpty()) {
            res = stack.pop() + " "+res;
        }
        res = res.trim();
        System.out.println(res);

    }
}
