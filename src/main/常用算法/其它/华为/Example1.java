package 常用算法.其它.华为;

/**
 * @author: sotowang
 * @date: 2020/09/03 10:42
 */
public class Example1 {
    class UnionFind{
        private int[] parent;
        private int count;

        public UnionFind(int n) {
            //0 1 2 3 4  5
            //0 0 0 0 4  4
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
            this.count = n;
        }
        public int find(int x) {
            while (x != parent[x]) {
                x = parent[parent[x]];
            }
            return x;
        }
        public void union(int x, int y) {
            int parentX = find(x);
            int parentY = find(y);
            if (parentX == parentY) {
                return;
            }
            parent[parentY] = parentX;
            count--;
        }
    }
    public int findCommonFriends(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        UnionFind uf = new UnionFind(rows);
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (matrix[i][j] == 1){
                    uf.union(i, j);
                }
            }
        }
        return uf.count;
    }


    public static void main(String[] args) {

    }
}
