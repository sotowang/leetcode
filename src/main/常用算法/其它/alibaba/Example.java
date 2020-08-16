package 常用算法.其它.alibaba;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public class Example {

    private static int solution(int[][] matrix, int d, int max, int min) {
        int initial = matrix[0][0];
        boolean isSame = true;
        for (int i = 0; i < matrix.length; i++) {
            if (isSame) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] != initial) {
                        isSame = false;
                        break;
                    }
                }
            }
        }
        if (isSame) {
            return 0;
        }
        return calc(matrix, d, max);

    }

    private static int calc(int[][] matrix, int d, int max) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((max - matrix[i][j]) % d != 0) {
                    return -1;
                }
                count += (max - matrix[i][j])/d;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] matrix = new int[n][n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                max = Math.max(max, matrix[i][j]);
                min = Math.max(min, matrix[i][j]);
            }
        }

        System.out.println(solution(matrix, d, max, min));
    }

}
