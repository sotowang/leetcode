package 动态规划.斐波那契数列.剑指offer10_I;

/**
 * @auther: sotowang
 * @date: 2020/4/13 21:37
 */
public class Fib {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int count = 3;
        int one = 1;
        int two = 1;
        int three = 1;
        while(count++ <=n){
            three = (one+two)%1000000007;
            one = two;
            two = three;
        }
        return three;
    }
}
