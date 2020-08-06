package 常用算法.多线程.多个线程交替打印ABC;

/**
 * @author: sotowang
 * @date: 2020/08/06 15:10
 */

import java.util.concurrent.CountDownLatch;

/**
 * 多个线程交替打印ABC
 */
public class ThreadPrintABC implements Runnable {
    CountDownLatch countDownLatchA = new CountDownLatch(1);
    CountDownLatch countDownLatchB = new CountDownLatch(1);
    CountDownLatch countDownLatchC = new CountDownLatch(1);

    private void printA() {
        System.out.println(Thread.currentThread().getName() + " - " + "A");
        countDownLatchA.countDown();
    }
    private void printB() {
        try {
            countDownLatchA.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " - " + "B");
        countDownLatchB.countDown();
    }
    private void printC() {
        try {
            countDownLatchB.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " - " + "C");
        countDownLatchB.countDown();
    }
    @Override
    public void run() {
        printA();
        printB();
        printC();
    }


    public static void main(String[] args) {
        int threadCount = 3;
        for (int i = 0; i < threadCount; i++) {
            new Thread(new ThreadPrintABC()).start();
        }
    }


}
