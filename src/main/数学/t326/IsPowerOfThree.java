package 数学.t326;

/**
 * @auther: sotowang
 * @date: 2020/4/17 18:28
 */
public class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        double res = Math.round(Math.log(n)/Math.log(3));
        return n==Math.pow(3,res);
    }
}
