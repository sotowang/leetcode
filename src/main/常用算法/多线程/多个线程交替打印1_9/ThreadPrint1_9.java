package 常用算法.多线程.多个线程交替打印1_9;

/**
 * @author: sotowang
 * @date: 2020/08/06 14:42
 */
public class ThreadPrint1_9 implements Runnable {
    private int max;
    private int val;
    /**
     * 线程数
     */
    private int threadCount;

    private static final Object lock = new Object();

    public ThreadPrint1_9(int max, int threadCount) {
        this.max = max;
        this.threadCount = threadCount;
    }

    @Override
    public void run() {
        while (true) {
            synchronized(lock){
                while (Integer.valueOf(Thread.currentThread().getName()) != val % threadCount) {
                    if (val >= max) {
                        break;
                    }
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (val >= max) {
                    break;
                }
                System.out.println("Thread - " + Thread.currentThread().getName() + ", the val is " + val++);
                lock.notifyAll();
            }
        }

    }

    public static void main(String[] args) {
        int max = 10;
        int threadCount = 3;
        ThreadPrint1_9 tp = new ThreadPrint1_9(max, threadCount);
        for (int i = 0; i < threadCount; i++) {
            new Thread(tp, String.valueOf(i)).start();
        }
    }


}
