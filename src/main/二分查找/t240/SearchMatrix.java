package 二分查找.t240;

import 二分查找.t81.Search;

/**
 * @auther: sotowang
 * @date: 2019/11/21 21:27
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        //从右上角开始搜索
        int row = 0;
        while (row < rows && cols > 0) {
            if (matrix[row][cols-1] == target) {
                return true;
            } else if (matrix[row][cols - 1] > target) {
                cols--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(new SearchMatrix().searchMatrix(matrix, 5));
        System.out.println(new SearchMatrix().searchMatrix(matrix, 20));
    }
}
