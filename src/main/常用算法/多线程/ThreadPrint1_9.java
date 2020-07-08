package 常用算法.多线程;

/**
 * @auther: sotowang
 * @date: 2020/07/08 23:30
 * 三个线程交替打印1-9
 */
public class ThreadPrint1_9 implements Runnable {
    private volatile int val = 0;
    private int max;
    private int threadCount;
    private static final Object lock = new Object();

    public ThreadPrint1_9(int max, int threadCount) {
        this.max = max;
        this.threadCount = threadCount;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                while (val % threadCount != Integer.valueOf(Thread.currentThread().getName())) {
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
                System.out.println("thread - " + Thread.currentThread().getName() + ", the val is " + val++);
                lock.notifyAll();
            }
        }
    }



    public static void main(String[] args) {
        int threadCount = 3;
        int max = 10;
        ThreadPrint1_9 tp = new ThreadPrint1_9(max, threadCount);
        for(int i=0;i<threadCount;i++) {
            new Thread(tp, String.valueOf(i)).start();
        }
    }

}
