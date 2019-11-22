package 哈希表.t36;

/**
 * @auther: sotowang
 * @date: 2019/11/22 21:04
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0] == null || board[0].length == 0) {
            return false;
        }
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] subs = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '0';
                //处理行
                if ((rows[i] >> num) % 2 == 1) {
                    return false;
                } else {
                    rows[i] += 1 << num;
                }

                //处理列
                if ((cols[j] >> num) % 2 == 1) {
                    return false;
                } else {
                    cols[j] += 1 << num;
                }

                //处理3x3
                //map成一维[i/3*3+j/3]
                if ((subs[i / 3 * 3 + j / 3] >> num) % 2 == 1) {
                    return false;
                } else {
                    subs[i / 3 * 3 + j / 3] += 1 << num;
                }
            }
        }
        return true;
    }
}
