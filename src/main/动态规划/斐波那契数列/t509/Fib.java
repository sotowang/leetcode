package 动态规划.斐波那契数列.t509;

/**
 * @auther: sotowang
 * @date: 2020/4/13 21:42
 */
public class Fib {

    public int fib(int N) {
        if(N<=1){
            return N;
        }
        int count = 3;
        int one = 1;
        int two = 1;
        int three = 1;
        while(count++ <=N){
            three = one+two;
            one = two;
            two = three;
        }
        return three;
    }
}
