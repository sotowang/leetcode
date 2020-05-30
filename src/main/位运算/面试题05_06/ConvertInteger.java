package 位运算.面试题05_06;

/**
 * @author: wangsongtao
 * @date: 2020/05/30 15:36
 */
public class ConvertInteger {
    public int convertInteger(int A, int B) {
        int res = A ^ B;
        int count = 0;
        while(res != 0){
            res &= (res-1);
            count++;
        }
        return count;
    }
}
