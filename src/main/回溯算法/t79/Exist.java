package 回溯算法.t79;

/**
 * @auther: sotowang
 * @date: 2019/12/05 21:46
 */
public class Exist {
    private int[][] direction = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    public boolean exist(char[][] board, String word) {
        if (word.length() > board.length * board[0].length) {
            return false;
        }
        boolean[][] mark = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) != board[i][j]) {
                    continue;
                } else {
                    if (dfs(board, word, i, j, 0, mark)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index, boolean[][] mark) {
        mark[i][j] = true;
        if (word.charAt(index) != board[i][j]) {
            mark[i][j] = false;
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }
        for (int k = 0; k < direction.length; k++) {
            int m = i + direction[k][0];
            int n = j + direction[k][1];
            if ( m > board.length - 1 || m < 0 || n > board[0].length - 1 || n < 0 || mark[m][n]) {
                continue;
            }
            if (dfs(board, word, m, n, index + 1, mark)) {
                return true;
            }
        }
        mark[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        char[][] board1 = {
                {'A', 'B'},
                {'C', 'D'},
        };
        System.out.println(new Exist().exist(board1, "ACDB"));
        System.out.println(new Exist().exist(board, "ABCCED"));
        System.out.println(new Exist().exist(board, "SEE"));
        System.out.println(new Exist().exist(board, "ABCB"));
    }
}
