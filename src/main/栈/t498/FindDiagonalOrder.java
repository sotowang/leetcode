package 栈.t498;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/2/20 20:53
 */
public class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return new int[]{};
        }
        int[] res = new int[matrix.length * matrix[0].length];
        int index = 0;
        int count = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        boolean pos = true;
        while (count++ < matrix.length + matrix[0].length) {
            int limit = Math.min(matrix.length, count);
            for (int i = 0; i < limit; i++) {
                if (count - i - 1 < matrix[0].length) {
                    if (!pos) {
                        res[index++] = matrix[i][count - i - 1];
                    } else {
                        stack.push(matrix[i][count - i - 1]);
                    }
                }
            }
            while (!stack.isEmpty()) {
                res[index++] = stack.poll();
            }
            pos = !pos;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //1,2,4,7,5,3,6,8,9
        Arrays.stream(new FindDiagonalOrder().findDiagonalOrder(matrix)).forEach(e -> {
            System.out.print(e + ",");
        });
    }
}
