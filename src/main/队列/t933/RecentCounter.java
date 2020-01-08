package 队列.t933;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/01/08 11:18
 */
public class RecentCounter {
    private LinkedList<Integer> list;
    public RecentCounter() {
        list = new LinkedList<>();
    }

    public int ping(int t) {
        list.addLast(t);
        //移除前面小于t-3000的
        while (list.getFirst() < t - 3000) {
            list.removeFirst();
        }
        return list.size();
    }
}
