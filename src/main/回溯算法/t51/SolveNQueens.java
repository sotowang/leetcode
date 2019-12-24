package 回溯算法.t51;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/22 11:50
 */
public class SolveNQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[][] nums = new int[n][n];
        //主对角线状态
        int[] master = new int[n + n - 1];
        //副对角线状态
        int[] slave = new int[n + n - 1];
        int[] column = new int[n];
        backTrace(nums, 0, 0, new ArrayList<>(),master, slave, column, res);
        return res;
    }

    private void backTrace(int[][] nums, int rowIndex, int colIndex, List<String> list, int[] master, int[] slave, int[] column, List<List<String>> res) {
        if (colIndex == nums[0].length) {
            return;
        }
        if (rowIndex == nums.length) {
            res.add(new ArrayList<>(list));
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
            String s = "";
            for (int j = 0; j < nums[0].length; j++) {
                if (j == i) {
                    s += "Q";
                } else {
                    s += ".";
                }
            }
            list.add(s);
            backTrace(nums, rowIndex + 1, i, list, master, slave, column, res);
            column[i] = 0;
            slave[i + rowIndex] = 0;
            master[i - rowIndex + nums.length - 1] = 0;
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new SolveNQueens().solveNQueens(4));

    }

}
