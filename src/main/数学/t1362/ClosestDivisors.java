package 数学.t1362;

/**
 * @auther: sotowang
 * @date: 2020/06/24 23:16
 */
public class ClosestDivisors {
    public int[] closestDivisors(int num) {
        int sqrt = (int)Math.sqrt(num+2);
        int[] res = new int[2];
        for(int i=sqrt;i> 0;i--){
            if((num+1) % i == 0){
                res[0] = i;
                res[1] = (num+1)/i;
                return res;
            }
            if((num+2)%i == 0){
                res[0] = i;
                res[1] = (num+2)/i;
                return res;
            }
        }
        return res;
    }
}
