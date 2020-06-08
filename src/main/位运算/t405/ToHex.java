package 位运算.t405;

/**
 * @author: wangsongtao
 * @date: 2020/06/08 20:39
 */
public class ToHex {
    public String toHex(int num) {
        if(num == 0){
            return "0";
        }
        String res = "";
        char[] cs = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        while(num != 0){
            res =   cs[(num & 15)] +res;
            num >>>= 4;
        }
        return res;
    }
}
