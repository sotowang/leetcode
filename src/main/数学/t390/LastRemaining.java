package 数学.t390;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/11 22:09
 */
public class LastRemaining {
    public int lastRemaining(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        while (list.size() > 1) {
            int index = 0;
            while (list.size()>1 &&index < list.size()) {
                list.remove(index);
                index++;
            }
            index = list.size() - 1;
            while (list.size() > 1 && index >= 0) {
                list.remove(index);
                index-= 2;
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        assert new LastRemaining().lastRemaining(1000000) == 481110;
        assert new LastRemaining().lastRemaining(10) == 8;
        assert new LastRemaining().lastRemaining(9) == 6;
    }
}
