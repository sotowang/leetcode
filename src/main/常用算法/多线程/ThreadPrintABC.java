package 常用算法.多线程;

import java.util.concurrent.*;

/**
 * @auther: sotowang
 * @date: 2020/4/11 21:18
 */
public class ThreadPrintABC{
    CountDownLatch countDownLatch1 = new CountDownLatch(1);
    CountDownLatch countDownLatch2 = new CountDownLatch(1);
    CountDownLatch countDownLatch3 = new CountDownLatch(1);
    private void printA() {
        System.out.print("A");
        countDownLatch1.countDown();
    }
    private void printB()  {
        try {
            countDownLatch1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("B");
        countDownLatch2.countDown();

    }
    private void printC()  {
        try {
            countDownLatch2.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch3.countDown();
        System.out.print("C");
    }

    public static void main(String[] args) {
        ThreadPrintABC tpabc = new ThreadPrintABC();
        for (int i = 0; i < 5; i++) {
            new Thread(tpabc::printA).start();
            new Thread(tpabc::printB).start();
            new Thread(tpabc::printC).start();
        }
    }


}
