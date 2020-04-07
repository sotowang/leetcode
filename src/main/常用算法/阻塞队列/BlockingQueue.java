package 常用算法.阻塞队列;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @auther: sotowang
 * @date: 2020/4/7 20:37
 * https://blog.csdn.net/z_565282532/article/details/77623109
 */
public class BlockingQueue {
    private final int  minSize = 0;
    private final int maxSize;
    private final LinkedList<Object> linkedList;
    //记录队列数目
    AtomicInteger count = new AtomicInteger(0);
    private final Object lock = new Object();
    public BlockingQueue(int maxSize){
        this.maxSize = maxSize;
        linkedList = new LinkedList<>();
    }
    public BlockingQueue() {
        //给一个默认长度
        maxSize = 2;
        linkedList = new LinkedList<>();
    }
    public int size(){
        return count.get();
    }
    public void put(Object o){
        synchronized (lock){
            while (size() >= maxSize) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            linkedList.offerLast(o);
            count.getAndIncrement();
            System.out.println("放入一个元素" + o + ",目前size为" + size());
            lock.notify();
        }
    }
    public Object take(){
        synchronized (lock){
            while (size() == minSize) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Object o = linkedList.pollFirst();
            count.getAndDecrement();
            System.out.println("取走一个元素" + o + ",目前size为" + size());
            lock.notify();
            return o;
        }
    }

    public static void main(String[] args) {
        BlockingQueue bq = new BlockingQueue(3);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int index = 0;
                while (index < 100) {
                    bq.put(index++);
                }
            }
        });
        t1.start();
        try {
            Thread.sleep(10);
            System.out.println("当前容器大小为" + bq.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Object o = bq.take();
                    System.out.println("取出的元素为 " + o);
                }
            }
        });
        t2.start();
        try {
            Thread.sleep(10);
            System.out.println("当前容器大小为" + bq.size());
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
}
