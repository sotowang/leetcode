package 常用算法.单例模式;

/**
 * @auther: sotowang
 * @date: 2020/3/24 21:38
 */
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return singleton2;
    }
}
