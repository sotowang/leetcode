package 位运算.t476;

/**
 * @auther: sotowang
 * @date: 2020/4/30 20:30
 */
public class FindComplement {
    public int findComplement(int num) {
        int tem = 0;
        int n = num;
        while(num !=0){
            num >>=1;
            tem = (tem<<1)+1;
        }
        //System.out.print(num^tem);
        return n^tem;
    }
}
