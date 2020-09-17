package 回溯算法.t79;

/**
 * @auther: sotowang
 * @date: 2019/12/05 21:46
 */
public class Exist {
    private int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0] == null || board[0].length == 0 || word.length() > board.length * board[0].length){
            return false;
        }
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    visited[i][j] = true;
                    if(backTrace(board,word,1,visited,i,j)){
                        return true;
                    }
                    visited[i][j] = false;
                }
            }
        }
        return false;
    }
    private boolean backTrace(char[][] board,String word,int start,boolean[][] visited,int row,int col){
        if(start == word.length()){
            return true;
        }
        for(int i=0;i<dirs.length;i++){
            int m = row + dirs[i][0];
            int n = col + dirs[i][1];
            if(m>=0 && n>=0 && m< board.length && n< board[0].length && !visited[m][n] &&  board[m][n] == word.charAt(start)){
                visited[m][n] = true;
                if(backTrace(board,word,start+1,visited,m,n)){
                    return true;
                }
                visited[m][n] = false;
            }
        }
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
