package 回溯算法.t37;

/**
 * @auther: sotowang
 * @date: 2020/2/1 16:29
 */
public class SolveSudoku {
    public void solveSudoku(char[][] board) {
        boolean[][] rowNum = new boolean[board.length][board.length + 1];
        boolean[][] colNum = new boolean[board.length][board.length + 1];
        boolean[][] subArea = new boolean[board.length][board.length + 1];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    rowNum[i][board[i][j] - '0'] = true;
                    colNum[j][board[i][j] - '0'] = true;
                    //公式m*3+n   m=i/3,n=j/3
                    subArea[(i / 3) * 3 + j / 3][board[i][j] - '0'] = true;
                }
            }
        }
        backTrace(board, 0, 0, rowNum, colNum, subArea);
    }

    private boolean backTrace(char[][] board, int row, int col,
                              boolean[][] rowNum,
                              boolean[][] colNum,
                              boolean[][] subArea) {
        while (board[row][col] != '.') {
            if (++col >= board.length) {
                row++;
                //换行
                col = 0;
            }
            //到最后一行
            if (row >= board.length) {
                return true;
            }
        }
        for (int k = 1; k <= board.length; k++) {
            if (rowNum[row][k] || colNum[col][k] || subArea[(row / 3) * 3 + col / 3][k]) {
                continue;
            }
            board[row][col] = (char) (k + '0');
            rowNum[row][k] = true;
            colNum[col][k] = true;
            subArea[(row / 3) * 3 + col / 3][k] = true;
            if (backTrace(board, row, col, rowNum, colNum, subArea)) {
                return true;
            } else {
                board[row][col] = '.';
                rowNum[row][k] = false;
                colNum[col][k] = false;
                subArea[(row / 3) * 3 + col / 3][k] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
//        char[][] board = {
//                {'1', '.', '.'},
//                {'.', '.', '1'},
//                {'.', '1', '.'},
//        };
        new SolveSudoku().solveSudoku(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + ",");
            }
            System.out.println();
        }

    }
}
