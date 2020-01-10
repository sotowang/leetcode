package 栈.t739;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/01/10 15:37
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) {
            return new int[]{};
        }
        LinkedList<Integer> tem = new LinkedList<>();
        int[] res = new int[T.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = i;
        }
        //tem存放下标
        tem.push(0);
        for (int i = 1; i < T.length; i++) {
            while (!tem.isEmpty() && T[tem.peek()] < T[i]) {
                int index = tem.pop();
                res[index] = i - index;
            }
            tem.push(i);
        }
        while (!tem.isEmpty()) {
            res[tem.pop()] = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = new DailyTemperatures().dailyTemperatures(T);
        Arrays.stream(res).forEach(System.out::print);

    }
}
