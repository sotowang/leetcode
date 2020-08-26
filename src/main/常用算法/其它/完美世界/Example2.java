package 常用算法.其它.完美世界;

import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2  {
    static int calSquareNum(double x, double y, double r) {
        int[][] area = {{0, 0, 30, 30}, {0, 30, 30, 60}, {0, 60, 30, 90},
                {30, 0, 60, 30}, {30, 30, 60, 60}, {30, 60, 60, 90},
                {60, 0, 90, 30}, {60, 30, 90, 60}, {60, 60, 90, 90}};
        double up = y +r;
        double down = y - r;
        double left = x - r;
        double right = x + r;
//        for (int i = 0; i < area.length; i++) {
//            if (up > area[i][1] && up < area[i][3] && left> area[i][0]) {
//
//            }
//        }
        int count = 0;
        if (r <= 15) {
            return 1;
        }
        if (r <= 21.21) {
            return 5;
        }
        if (r > 21.21) {
            return 9;
        }

        return 2;

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double r = in.nextDouble();
        System.out.println(calSquareNum(x, y, r));

    }
}
