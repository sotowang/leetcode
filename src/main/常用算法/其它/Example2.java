package 常用算法.其它;

import java.util.BitSet;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 extends Example {
    public int override(int a, int b) {
        return a-b;
    }

    public long override1(int a, int b, int c) {
        return a - c;
    }
    public long override1(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        System.out.println(example2.override1(1, 2, 1));
        BitSet bs = new BitSet();
        bs.set(10);
        bs.set(100);
        bs.set(99);
        System.out.println(bs.get(101));
    }
}
