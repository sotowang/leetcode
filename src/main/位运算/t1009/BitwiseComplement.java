package 位运算.t1009;

/**
 * @auther: sotowang
 * @date: 2020/4/30 20:33
 */
public class BitwiseComplement {
    public int bitwiseComplement(int N) {
        if(N==0){
            return 1;
        }
        int tem = 0;
        int n = N;
        while(N !=0){
            N >>=1;
            tem = (tem<<1)+1;
        }
        //System.out.print(num^tem);
        return n^tem;
    }
}
