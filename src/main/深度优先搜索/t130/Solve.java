package 深度优先搜索.t130;


/**
 * @auther: sotowang
 * @date: 2019/11/12 20:02
 */
public class Solve {
    //四个方向
    int[][] dirs = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0] == null || board[0].length == 0) {
            return;
        }
        int rows = board.length;
        int cols = board[0].length;
        if (rows < 3 || cols < 3) {
            return;
        }
        for (int i = 0; i < cols; i++) {
            //第一行
            if (board[0][i] == 'O') {
                dfs(board, 0, i);
            }
            //最后一行
            if (board[rows - 1][i] == 'O') {
                dfs(board, rows - 1, i);
            }
        }

        for (int i = 0; i < rows; i++) {
            //第一列
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            //最后一列
            if (board[i][cols - 1] == 'O') {
                dfs(board, i, cols - 1);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'b') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        //将该o处设置为b
        board[i][j] = 'b';

        int rows = board.length;
        int cols = board[0].length;

        //四个方向遍历一遍
        for (int[] dir :
                dirs) {
            int temp_i = i + dir[0];
            int temp_j = j + dir[1];
            if (temp_i >= rows || temp_i < 0 || temp_j >= cols || temp_j < 0 || board[temp_i][temp_j] != 'O') {
                continue;
            }
            dfs(board, temp_i, temp_j);
        }
    }

    public static void main(String[] args) {
//        char[][] board = new char[][]{{'x', 'x', 'x', 'x'}, {'x', 'o', 'o', 'x'}, {'x', 'x', 'o', 'x'}, {'x', 'o', 'x', 'x'}};
//        char[][] board = new char[][]{{'x', 'o', 'x', 'o','x','o'}, {'o','x', 'o','x', 'o', 'x'}, {'x', 'o', 'x', 'o','x','o'},  {'o','x', 'o','x', 'o', 'x'}};
        //[["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
        char[][] board = new char[][]{{'x', 'x', 'x', 'x'}, {'x', 'o', 'o', 'x'}, {'x', 'x', 'o', 'x'}, {'x', 'o', 'x', 'x'}};
        new Solve().solve(board);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();

        }
    }
}
