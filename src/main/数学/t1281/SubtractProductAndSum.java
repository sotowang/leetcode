package 数学.t1281;

/**
 * @author: wangsongtao
 * @date: 2020/05/22 20:54
 */
public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
        while(n != 0 ){
            int tem = n%10;
            sum += tem;
            mul *= tem;
            n /=10;
        }
        return mul-sum;
    }
}
