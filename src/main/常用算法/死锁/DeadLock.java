package 常用算法.死锁;


/**
 * @author: sotowang
 * @date: 2020/08/12 16:01
 */
public class DeadLock {
    private Object lockA = new Object();
    private Object lockB = new Object();
    public void funA() {
        synchronized (lockA) {
            try {
                Thread.sleep(1000);
                System.out.println("funA 获取锁A，正在获取锁B");
                synchronized (lockB) {
                    System.out.println("funA 已获取锁B");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void funB()  {
        synchronized (lockB) {
                try {
                    Thread.sleep(1000);
                    System.out.println("funB 获取锁B，正在获取锁A");
                    synchronized (lockA) {
                        System.out.println("funB 已获取锁A");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }

    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        new Thread(dl::funA).start();
        new Thread(dl::funB).start();


    }
}
