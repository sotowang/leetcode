package 常用算法.多线程.t1195;

/**
 * @auther: sotowang
 * @date: 2020/05/19 22:22
 */
public class FizzBuzz {
    private int n;
    private Semaphore  f = new Semaphore(0);
    private Semaphore b = new Semaphore(0);
    private Semaphore fb = new Semaphore(0);
    private Semaphore mutex = new Semaphore(1);
    private volatile int cur = 1;
    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(true){
            f.acquire(1);
            if(cur>n) break;
            printFizz.run();
            cur++;
            mutex.release(1);
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(true){
            b.acquire(1);
            if(cur>n) break;
            printBuzz.run();
            cur++;
            mutex.release(1);
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(true){
            fb.acquire(1);
            if(cur>n) break;
            printFizzBuzz.run();
            cur++;
            mutex.release(1);
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while(true){
            mutex.acquire(1);
            if(cur>n){
                break;
            }
            if(cur %3 == 0 && cur %5 == 0){
                fb.release(1);
            }else if(cur %3 == 0){
                f.release(1);
            }else if(cur %5 == 0){
                b.release(1);
            }else{
                printNumber.accept(cur);
                cur++;
                mutex.release(1);
            }
        }
        f.release(1);
        b.release(1);
        fb.release(1);
        mutex.release(1);
    }
}
