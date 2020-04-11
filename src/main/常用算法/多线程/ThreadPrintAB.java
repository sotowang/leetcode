package 常用算法.多线程;

/**
 * @auther: sotowang
 * @date: 2020/3/25 14:21
 */

/**
 * 循环打印AB
 */
public class ThreadPrintAB {


    //上一个打印的是否为A
    private volatile boolean printA = false;

    public synchronized void printA() {
        try {
            //如果上一次打印了A
            while (printA) {
                this.wait();
            }
            System.out.print("A");
            printA = true;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void printB() {
        try {
            //如果上一次打印了B
            while (!printA) {
                this.wait();
            }
            System.out.print("B");
            printA = false;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadPrintAB te = new ThreadPrintAB();
        for (int i = 0; i < 10; i++) {
            new Thread(te::printA).start();
//            new Thread(te::printA).start();
            new Thread(te::printB).start();
        }
    }

}
