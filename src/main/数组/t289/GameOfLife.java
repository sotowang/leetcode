package 数组.t289;

/**
 * @auther: sotowang
 * @date: 2019/12/07 21:38
 */
public class GameOfLife {
    //0: 0->0
    //1: 1->1
    //-1: 0->1
    //-2: 1->0
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0 || board[0] == null || board[0].length == 0) {
            return;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                check(board, i, j);
            }
        }
    }

    private void check(int[][] board, int i, int j) {
        int left = Math.max(j - 1, 0);
        int right = Math.max(j + 1, board[0].length - 1);
        int up = Math.max(i - 1, 0);
        int down = Math.max(i + 1, board.length - 1);
        int count = 0;

    }
}
