package 数组.t119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/06 20:17
 */
public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        long cur = 1;
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) cur);
            cur = cur * (rowIndex - i) / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new GetRow().getRow(0));
    }
}
