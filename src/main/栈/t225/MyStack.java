package 栈.t225;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/11/27 21:39
 */
public class MyStack {
    LinkedList<Integer> queue1;
    LinkedList<Integer> queue2;
    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue1 = new LinkedList();
        queue2 = new LinkedList();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue1.offer(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {

        while (queue1.size()>1) {
            queue2.offer(queue1.poll());
        }
        int q = queue1.poll();
        LinkedList temp = queue2;
        queue2 = queue1;
        queue1 = temp;
        return q;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue1.peekLast();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.empty());
    }
}
