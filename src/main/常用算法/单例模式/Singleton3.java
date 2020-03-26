package 常用算法.单例模式;

/**
 * @auther: sotowang
 * @date: 2020/3/24 21:39
 */
//枚举单例
public enum Singleton3 {
    INSTANCE;

    public static void main(String[] args) {
        Singleton3 singleton3 = Singleton3.INSTANCE;
    }
}

