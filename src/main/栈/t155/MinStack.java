package 栈.t155;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/11/27 21:21
 */
public class MinStack {
    private LinkedList<Integer> stack;
    private LinkedList<Integer> minStack;
    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new LinkedList();
        minStack = new LinkedList();
    }

    public void push(int x) {
        stack.push(x);
        if (!minStack.isEmpty()) {
            if (x <= minStack.peek()) {
                minStack.push(x);
            }
        } else {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int p = stack.pop();
            if (!minStack.isEmpty() && minStack.peek()== p) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }

}
