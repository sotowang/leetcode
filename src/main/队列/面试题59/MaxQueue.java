package 队列.面试题59;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/3/7 22:44
 */
public class MaxQueue {
    private ArrayDeque<Integer> queue;
    private ArrayDeque<Integer> helpQueue;
    public MaxQueue() {
        this.queue = new ArrayDeque<>();
        this.helpQueue = new ArrayDeque<>();
    }

    public int max_value() {
        return helpQueue.isEmpty() ? -1 : helpQueue.peek();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!helpQueue.isEmpty() && helpQueue.peekLast() < value) {
            helpQueue.pollLast();
        }
        helpQueue.offer(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        int val = queue.poll();
        if (helpQueue.peek() == val) {
            return helpQueue.poll();
        }
        return val;
    }
}
