package 设计.t622;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/2/14 17:27
 */
public class MyCircularQueue {
    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    private int[] queue;
    //front指向队列首元素之前
    private int front;
    //rear指向队列尾那个元素
    private int rear;
    private int len;

    public MyCircularQueue(int k) {
        queue = new int[k + 1];
        Arrays.fill(queue, -1);
        front = rear = 0;
        len = k + 1;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % len;
        queue[rear] = value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front += 1 % len;
        queue[front] = -1;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        return queue[(front + 1) % len];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        return queue[rear];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return rear == front;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (rear + 1) % len == front;
    }

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        assert circularQueue.enQueue(1) == true;
        assert circularQueue.enQueue(2) == true;
        assert circularQueue.enQueue(3) == true;
        assert circularQueue.enQueue(4) == false;
        assert circularQueue.Rear() == 3;
        assert circularQueue.isFull() == true;
        assert circularQueue.deQueue() == true;
        assert circularQueue.enQueue(4) == true;
        assert circularQueue.Rear() == 4;
    }
}
