package 动态规划.斐波那契数列.面试题10_II;

/**
 * @auther: sotowang
 * @date: 2020/4/13 21:31
 */
public class NumWays {

    public int numWays(int n) {
        if(n == 0) return 1;
        if(n<=3){
            return n;
        }
        int one = 1;
        int two = 2;
        int three = 3;;
        int count = 3;
        while(count++<=n){
            three = (one+two)%1000000007;
            one = two;
            two = three;
        }
        return three;
    }
}
