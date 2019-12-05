package 数组.t73;

/**
 * @auther: sotowang
 * @date: 2019/12/05 21:17
 */
public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        //每一行和每一列是否有0的标志位
        boolean rowFlag = false;
        boolean colFlag = false;
        //检查第一行是否有0
        for (int i = 0; i < cols; i++) {
            if (matrix[0][i] == 0) {
                rowFlag = true;
                break;
            }
        }
        //检查第一列是否有0
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                colFlag = true;
                break;
            }
        }
        //从(1,1)开始遍历
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                //若为0,则标记该行,列
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        //置0
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (rowFlag) {
            for (int i = 0; i < cols; i++) {
                matrix[0][i] = 0;
            }
        }
        if (colFlag) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1, 1, 1},
//                {1, 0, 1},
//                {1, 1, 1}
//        };
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        new SetZeroes().setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
