package 常用算法.单例模式;

/**
 * @auther: sotowang
 * @date: 2020/3/24 21:29
 */
public class Singleton1 {
    //懒汉式
    private static volatile Singleton1 singleton;
    private Singleton1(){}
    public static Singleton1 getSingleton(){
        if (null == singleton) {
            synchronized (Singleton1.class) {
                if (null == singleton) {
                    singleton = new Singleton1();
                }
            }
        }
        return singleton;
    }
}
