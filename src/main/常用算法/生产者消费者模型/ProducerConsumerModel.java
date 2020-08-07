package 常用算法.生产者消费者模型;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: sotowang
 * @date: 2020/08/07 16:26
 */
public class ProducerConsumerModel {
    /**
     * 当前队列中的元素个数
     */
    private AtomicInteger size = new AtomicInteger(0);
    private LinkedList<Object> linkedList;
    /**
     * 所能容纳的最大元素个数
     */
    private int maxSize;

    private static final Object LOCK = new Object();

    public ProducerConsumerModel(int maxSize) {
        this.linkedList = new LinkedList<>();
        this.maxSize = maxSize;
    }

    /**
     * 放元素
     */
    public void put(Object ele) {
        synchronized (LOCK){
            while (size.get() >= maxSize) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            linkedList.offer(ele);
            System.out.println("放入一个元素-" + ele.toString() + "目前存储元素大小为： " + size.getAndIncrement());
            LOCK.notifyAll();
        }
    }


    /**
     * 取元素
     */
    public Object take() {
        synchronized (LOCK){
            while (size.get() <= 0) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Object ele = linkedList.poll();
            System.out.println("消费者消费元素-" + ele.toString() + "  目前存储元素大小为： " + size.getAndDecrement());
            LOCK.notifyAll();
            return ele;
        }
    }

    public static void main(String[] args) {
        ProducerConsumerModel pcM = new ProducerConsumerModel(3);
        int count = 5;
        //生产者线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                int index = 0;
                while (index++ < count) {
                    pcM.put(index);
                }
            }
        }).start();
        //消费者线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    pcM.take();
                }
            }
        }).start();

        System.out.println("--------------------------");

    }
}
