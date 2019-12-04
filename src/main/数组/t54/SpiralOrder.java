package 数组.t54;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/04 20:49
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return res;
        }
        //设置上,下,左, 右 边界
        int up = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length - 1;
        int cur = 0;
        while (true) {
            //向右走,到尽头
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            //重新设定上边界
            if (++up > down) {
                break;
            }
            //向下走 到尽头
            for (int i = up; i <= down; i++) {
                res.add(matrix[i][right]);
            }
            //重新设定右边界
            if (--right < left) {
                break;
            }
            //向左走 到尽头
            for (int i = right; i >= left; i--) {
                res.add(matrix[down][i]);
            }
            //重新设定下边界
            if (--down < up) {
                break;
            }

            //向上走 到尽头
            for (int i = down; i >= up ; i--) {
                res.add(matrix[i][left]);
            }
            //重新设定左边界
            if (++left >right) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(new SpiralOrder().spiralOrder(matrix));

    }
}
