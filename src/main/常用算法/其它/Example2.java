package 常用算法.其它;

import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2  {
    private static int solution(long rows, long cols) {
        if(rows == 1){
            return (int) cols;
        }
        if(cols == 1){
            return (int) rows;
        }
        if ((rows * cols & 1) == 0) {
            return 2;
        } else {
            for (int i = 3; i <= rows * cols; i++) {
                if ((rows * cols) % i == 0) {
                    return i;
                }
            }
            return (int) (rows * cols);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            long n = in.nextLong();
            long m = in.nextLong();
            System.out.println(solution(n,m));
        }

    }
}
