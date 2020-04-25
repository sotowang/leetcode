package 位运算.面试题17_01;

/**
 * @auther: sotowang
 * @date: 2020/4/25 16:07
 */
public class Add {
    public int add(int a, int b) {
        int carry = 0;
        int sum = 0;
        while(b!=0){
            sum = a^b;
            carry = (a &b)<<1;
            a = sum;
            b = carry;
        }
        return a;
    }
}
