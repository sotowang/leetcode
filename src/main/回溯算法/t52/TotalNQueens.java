package 回溯算法.t52;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/24 15:22
 */
public class TotalNQueens {
    private int count = 0;
    public int totalNQueens(int n) {
        int[][] nums = new int[n][n];
        //主对角线状态
        int[] master = new int[n + n - 1];
        //副对角线状态
        int[] slave = new int[n + n - 1];
        int[] column = new int[n];
        backTrace(nums, 0, 0, master, slave, column);
        return count;
    }

    private void backTrace(int[][] nums, int rowIndex, int colIndex, int[] master, int[] slave, int[] column) {
        if (colIndex == nums[0].length) {
            return;
        }
        if (rowIndex == nums.length) {
            count++;
            return;
        }
        for (int i = 0; i < nums[0].length; i++) {
            //主对角线判定,次对角线判定,列判定
            if (master[i - rowIndex + nums.length - 1] == 1 || slave[i + rowIndex] == 1 || column[i] == 1) {
                continue;
            }
            column[i] = 1;
            slave[i + rowIndex] = 1;
            master[i - rowIndex + nums.length - 1] = 1;
            backTrace(nums, rowIndex + 1, i, master, slave, column);
            column[i] = 0;
            slave[i + rowIndex] = 0;
            master[i - rowIndex + nums.length - 1] = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new TotalNQueens().totalNQueens(4));
    }
}
