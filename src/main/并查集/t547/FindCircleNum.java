package 并查集.t547;

/**
 * @auther: sotowang
 * @date: 2020/01/13 10:12
 */
public class FindCircleNum {
    class UnionFind{
        //父节点
        private int[] parent;
        //每个连通树节点数量
        private int[] size;
        //当前连接分量
        private int count;

        public UnionFind(int n) {
            size = new int[n];
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
            this.count = n;
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) {
                return;
            }
            //小树接到大树下
            if (size[rootP] > size[rootQ]) {
                parent[rootQ] = rootP;
                size[rootP] += size[rootQ];
            } else {
                parent[rootP] = rootQ;
                size[rootQ] += size[rootP];
            }
            //连接分量--
            count--;
        }

        public int find(int x) {
            while (x != parent[x]) {
                //进行路径压缩
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }
        public int connected() {
            return count;
        }

    }
    public int findCircleNum(int[][] M) {
        if (M == null || M.length == 0 || M[0] == null || M[0].length == 0) {
            return 0;
        }
        UnionFind unionFind = new UnionFind(M.length);
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < i; j++) {
                if (M[i][j] == 1) {
                    unionFind.union(i, j);
                }
            }
        }
        return unionFind.count;
    }

    public static void main(String[] args) {
        int[][] M = {
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}
        };
        assert new FindCircleNum().findCircleNum(M) == 1;
    }
}
