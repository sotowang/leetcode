package 位运算.面试题64;

/**
 * @auther: sotowang
 * @date: 2020/05/05 19:58
 */
public class SumNums {
    public int sumNums(int n) {
        int sum = n;
        boolean flag = (n>0) && ((sum+=sumNums(n-1))>0);
        return sum;
    }
}
