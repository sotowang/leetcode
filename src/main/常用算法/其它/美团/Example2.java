package 常用算法.其它.美团;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2  {
    private static int travelCount(List<String[]> list) {
        String start  = list.get(0)[0];
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String end = list.get(i)[1];
            if (start.equals(end)) {
                count++;
                if (i < list.size() - 1) {
                    start = list.get(i + 1)[0];
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<String[]> list = new ArrayList<>();
        List<String> vertex = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] ss = new String[2];
            ss[0] = sc.next();
            if (!vertex.contains(ss[0])) {
                vertex.add(ss[0]);
            }
            if (!vertex.contains(ss[1])) {
                vertex.add(ss[1]);
            }
            ss[1] = sc.next();
            list.add(ss);
        }
        System.out.println(travelCount(list));

    }
}
