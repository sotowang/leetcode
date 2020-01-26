package 深度优先搜索.t529;

/**
 * @auther: sotowang
 * @date: 2020/1/25 17:02
 */
public class UpdateBoard {
    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0];
        int y = click[1];
        return null;
    }

    private void dfs(char[][] board, int x, int y) {
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
            return ;
        } else {

        }
    }
}
