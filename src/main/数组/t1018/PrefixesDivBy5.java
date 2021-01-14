package 数组.t1018;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sotowang
 * @date: 2021/01/14 16:59
 */
public class PrefixesDivBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int num = 0;
        for(int i=0;i<A.length;i++){
            num <<=1;
            num += A[i];
            num %= 10;
            res.add(num %5 == 0);
        }
        return res;
    }
}
