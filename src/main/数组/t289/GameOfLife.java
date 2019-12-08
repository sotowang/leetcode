package 数组.t289;

import com.sun.org.apache.bcel.internal.util.BCELifier;

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
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 1;
                } else if (board[i][j] == -2) {
                    board[i][j] = 0;
                }
            }
        }
    }

    private void check(int[][] board, int i, int j) {
        int left = Math.max(j - 1, 0);
        int right = Math.min(j + 1, board[0].length - 1);
        int up = Math.max(i - 1, 0);
        int down = Math.min(i + 1, board.length - 1);
        int count = 0;
        for (int k = up; k <= down; k++) {
            for (int l = left; l <= right; l++) {
                if ((k != i || l != j) && (board[k][l] == 1 || board[k][l] == -2)) {
                    count++;
                }
            }
        }
        //如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡
        if (board[i][j] == 1) {
            if (count < 2) {
                board[i][j] = -2;
            }else if (count > 3) { //如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
                board[i][j] = -2;
            }
        } else if (board[i][j] == 0 && count == 3) {
            board[i][j] = -1; //如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
        }
    }


    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        new GameOfLife().gameOfLife(board);


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
