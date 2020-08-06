package 常用算法.多线程.多个线程循环打印AB;

/**
 * @author: sotowang
 * @date: 2020/08/06 15:18
 */
public class ThreadPrintAB implements Runnable {
    private volatile boolean isPrintA = false;
    private static final Object lock = new Object();

    private void printA() {
        synchronized (lock) {
            while (isPrintA) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                isPrintA = !isPrintA;
                System.out.println("A");
            lock.notifyAll();
        }
    }
    private void printB() {
        synchronized (lock) {
            while (!isPrintA) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isPrintA = !isPrintA;
            System.out.println("B");
            lock.notifyAll();
        }
    }
    @Override
    public void run() {
        printA();
        printB();
    }

    public static void main(String[] args) {
        int threadCount = 4;
        ThreadPrintAB tp = new ThreadPrintAB();
        for (int i = 0; i < threadCount; i++) {
            new Thread(tp).start();
        }
    }
}
