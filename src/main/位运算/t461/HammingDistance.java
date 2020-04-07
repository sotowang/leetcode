package 位运算.t461;

/**
 * @auther: sotowang
 * @date: 2020/01/10 18:58
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int res = 0;
        while(x != 0 || y!=0){
            if(((x^y)&1)==1){
                res++;
            }
            x >>=1;
            y >>=1;
        }
        return res;
    }


    public static void main(String[] args) {
        assert new HammingDistance().hammingDistance(1, 4) == 2;
    }
}
