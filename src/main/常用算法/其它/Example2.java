package 常用算法.其它;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 extends ClassLoader implements Cloneable {
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }


    public static void main(String[] args) {
    }
}
