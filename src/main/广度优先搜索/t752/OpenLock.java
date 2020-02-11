package 广度优先搜索.t752;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/2/11 19:30
 */
public class OpenLock {
    public int openLock(String[] deadends, String target) {
        Queue<String> queue = new LinkedList<>();
        HashSet<String> visitedSet = new HashSet<>();
        HashSet<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        visitedSet.add("0000");
        queue.add("0000");
        if (deadSet.contains("0000")) {
            return -1;
        }
        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.poll();
                List<String> res = getNextString(str);
                for (String string :
                        res) {
                    if (!deadSet.contains(string) && !visitedSet.contains(string)) {
                        visitedSet.add(string);
                        if (target.equals(string)) {
                            return ++step;
                        }
                        queue.offer(string);
                    }
                }
            }
            step++;
        }
        return  -1;
    }

    private List<String> getNextString(String string) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < 4; i++) {
            char cur = string.charAt(i);
            sb.setCharAt(i, cur == '0' ? '9' : (char) (cur - 1));
            res.add(sb.toString());
            sb.setCharAt(i, cur == '9' ? '0' : (char) (cur + 1));
            res.add(sb.toString());
            sb.setCharAt(i, cur);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] deadends3 = {"0000"};
        assert new OpenLock().openLock(deadends3, "8888") == -1;
        String[] deadends2 = {"8887","8889","8878","8898","8788","8988","7888","9888"};
        assert new OpenLock().openLock(deadends2, "8888") == -1;
        String[] deadends1 = {"8888"};
        assert new OpenLock().openLock(deadends1, "0009") == 1;
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        assert new OpenLock().openLock(deadends, "0202") == 6;
    }
}
