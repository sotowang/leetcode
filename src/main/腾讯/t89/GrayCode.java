package 腾讯.t89;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/10 21:36
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            res.add(i ^ (i >> 1));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new GrayCode().grayCode(2));
    }
}
