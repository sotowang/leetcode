package 二分查找.t74;

/**
 * @auther: sotowang
 * @date: 2019/11/20 20:21
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        //从右上角开始比对,每次删除一行或一列,直至逼近
        while (row <rows && cols > 0) {
            if (matrix[row][cols - 1] == target) {
                return true;
            } else if (matrix[row][cols - 1] < target) {
                //删除一行
                row++;
            } else if (matrix[row][cols - 1] > target) {
                //删除一列
                cols--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        System.out.println(new SearchMatrix().searchMatrix(matrix, 3));
        System.out.println(new SearchMatrix().searchMatrix(matrix, 13));
    }
}
