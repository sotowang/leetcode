package 栈.t85;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/12/31 22:14
 */
public class MaximalRectangle {
    //与84题类似
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] rec = new int[cols];
        int max = 0;
        //将最大连续1做为矩形的高度
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '0') {
                    rec[j] = 0;
                } else {
                    rec[j]++;
                }
            }
            max = Math.max(calculateLargestArea(rec), max);
        }
        return max;
    }

    private int calculateLargestArea(int[] matrix) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(0);
        int max = 0;
        for (int i = 1; i < matrix.length; i++) {
            while (!stack.isEmpty() && matrix[i] < matrix[stack.peek()]) {
                int popIndex = stack.pop();
                int topIndex = stack.peek() == null ? -1 : stack.peek();
                max = Math.max((i - topIndex - 1) * matrix[popIndex], max);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int popIndex = stack.pop();
            int topIndex = stack.peek() == null ? -1 : stack.peek();
            max = Math.max((matrix.length - topIndex - 1) * matrix[popIndex], max);
        }
        return max;
    }

    public static void main(String[] args) {
        //{"1","0","1","0","0"}
        //{"1","0","1","1","1"}
        //{"1","1","1","1","1"}
        //{"1","0","0","1","0"}
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        assert new MaximalRectangle().maximalRectangle(matrix) == 6;
        char[][] matrix1 = new char[][]{
                {'1', '0'},
                {'0', '1'},
        };
        assert new MaximalRectangle().maximalRectangle(matrix1) == 1;



    }
}
