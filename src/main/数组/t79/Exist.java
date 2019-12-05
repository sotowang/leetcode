package 数组.t79;

/**
 * @auther: sotowang
 * @date: 2019/12/05 21:46
 */
public class Exist {
    public boolean exist(char[][] board, String word) {
        if (word.length() > board.length * board[0].length) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) != board[i][j]) {
                    continue;
                } else {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j ,int index) {
        if (i > board.length - 1 || i < 0 || j > board[0].length - 1 || j < 0 || word.charAt(index) != board[i][j]) {
            return false;
        }
        board[i][j] <<= 2;
        if (index == word.length() - 1) {
            return true;
        }
        boolean right = dfs(board, word, i, j + 1, index + 1);
        boolean down = dfs(board, word, i + 1, j, index + 1);
        boolean left = dfs(board, word, i , j-1, index + 1);
        boolean up = dfs(board, word, i - 1, j, index + 1);
        board[i][j] >>= 2;
        return up || down || left || right;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        System.out.println(new Exist().exist(board, "ABCCED"));
        System.out.println(new Exist().exist(board, "SEE"));
        System.out.println(new Exist().exist(board, "ABCB"));
    }
}
