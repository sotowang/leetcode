package 常用算法.单例模式;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @auther: sotowang
 * @date: 2020/3/24 21:43
 */
//CAS
public class Singleton4 {
    private static final AtomicReference<Singleton4> instance = new AtomicReference<>();

    private Singleton4(){}

    public static Singleton4 getInstance(){
        for (; ; ) {
            Singleton4 singleton4 = instance.get();
            if (null != singleton4) {
                return singleton4;
            }
            singleton4 = new Singleton4();
            if (instance.compareAndSet(null, singleton4)) {
                return singleton4;
            }
        }
    }
}
