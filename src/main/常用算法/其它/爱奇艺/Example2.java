package 常用算法.其它.爱奇艺;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dirs = sc.nextLine();
        System.out.println(check(dirs));
    }

    private static String check(String dirs) {
        int x = 0;
        int y = 0;
        HashSet<String> pathSet = new HashSet<>();
        pathSet.add(x + "," + y);
        for (int i = 0; i < dirs.length(); i++) {
            char c = dirs.charAt(i);
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'W') {
                x--;
            } else if (c == 'E') {
                x++;
            }
            if (!pathSet.add(x + "," + y)) {
                return "True";
            }
        }
        return "False";
    }
}
