package 栈.t739;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/01/10 15:37
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        LinkedList<Integer> stack = new LinkedList<>();
        int[] res = new int[T.length];
        stack.push(0);
        for(int i=1;i<T.length;i++){
            while(!stack.isEmpty() && T[i]>T[stack.peek()]){
                int index= stack.pop();
                res[index] = i-index;
            }
            stack.push(i);

        }
        return res;
    }

    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = new DailyTemperatures().dailyTemperatures(T);
        Arrays.stream(res).forEach(System.out::print);

    }
}
