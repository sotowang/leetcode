package 常用算法.其它;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @auther: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(1);
        integer.getAndIncrement();
        System.out.println(integer.get());
        integer.getAndDecrement();
        Random random = new Random();
        System.out.println(Integer.MAX_VALUE>5* Math.pow(10,8));
        int x = Integer.MAX_VALUE;
        long y = Long.MAX_VALUE;
        System.out.println( x+":"+(x + 1));
        System.out.println(y > y + 1);
    }

}
