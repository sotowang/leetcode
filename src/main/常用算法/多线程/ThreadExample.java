package 常用算法.多线程;

/**
 * @auther: sotowang
 * @date: 2020/3/25 14:21
 */
public class ThreadExample  {


    //上一个打印的是否为A
    private volatile boolean flag = false;

    public synchronized void printA() {
        try {
            //如果上一次打印了A
            while (flag) {
                this.wait();
            }
            System.out.print("A");
            flag = true;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void printB() {
        try {
            //如果上一次打印了B
            while (!flag) {
                this.wait();
            }
            System.out.print("B");
            flag = false;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadExample te = new ThreadExample();
        for (int i = 0; i < 10; i++) {
            new Thread(te::printA).start();
            new Thread(te::printB).start();

        }
    }

}
