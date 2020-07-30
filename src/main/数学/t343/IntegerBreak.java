package 数学.t343;

/**
 * @author: sotowang
 * @date: 2020/07/30 15:54
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        if(n<=3){
            return n-1;
        }
        int res = 1;
        while(n>4){
            res *= 3;
            n -= 3;
        }
        return res * n;


    }
}
