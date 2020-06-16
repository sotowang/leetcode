package 位运算.t1017;

/**
 * @auther: sotowang
 * @date: 2020/06/13 11:06
 */
public class BaseNeg2 {
    public String baseNeg2(int N) {
        if(N == 0){
            return "0";
        }
        String res = "";
        while(N != 0){
            int mod = N%(-2);
            res = mod == -1?1+res:mod+res;
            N = N/(-2);
            if(mod == -1){
                N++;
            }
        }
        return res;
    }
}
