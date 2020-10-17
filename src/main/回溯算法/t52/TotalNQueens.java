package 回溯算法.t52;

/**
 * @auther: sotowang
 * @date: 2019/12/24 15:22
 */
public class TotalNQueens {
    private int count = 0;

    public int totalNQueens(int n) {
        boolean[] master = new boolean[n * 2 - 1];
        boolean[] slave = new boolean[n * 2 - 1];
        boolean[] cols = new boolean[n];
        backTrace(0, 0, master, slave, cols, n);
        return count;
    }

    private void backTrace(int row, int col, boolean[] master, boolean[] slave, boolean[] cols, int n) {
        if (col == n) {
            return;
        }
        if (row == n) {
            count++;
            return;
        }
        //按列放
        for (int i = 0; i < n; i++) {
            if (master[i - row + n - 1] || slave[row + i] || cols[i]) {
                continue;
            }
            master[i - row + n - 1] = true;
            slave[row + i] = true;
            cols[i] = true;
            backTrace(row + 1, i, master, slave, cols, n);
            master[i - row + n - 1] = false;
            slave[row + i] = false;
            cols[i] = false;
        }
    }


    public static void main(String[] args) {
        System.out.println(new TotalNQueens().totalNQueens(4));
    }
}
