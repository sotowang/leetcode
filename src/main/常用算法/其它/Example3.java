package 常用算法.其它;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[]{"aaa", "bcd", "zzz", "bcdef"};
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        Collections.sort(list);
    }

    private static void dfs(String[]  s, int start) {

    }
}
