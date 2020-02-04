package 并查集.t947;

import java.util.HashSet;

/**
 * @auther: sotowang
 * @date: 2020/2/4 15:12
 */
public class RemoveStones {
    public class UnionFind{
        private int[] parent;
        private int[] size;

        public UnionFind(int n) {
            this.parent = new int[n];
            this.size = new int[n];
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public void union(int i, int j) {
            int parentI = find(i);
            int parentJ = find(j);
            if (parentI == parentJ) {
                return;
            }
            if (size[parentI] > size[parentJ]) {
                parent[parentI] = parentJ;
                size[parentJ] += size[parentI];
            } else {
                parent[parentJ] = parentI;
                size[parentI] += size[parentJ];
            }
        }

        private int find(int x) {
            while (parent[x] != x) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }
    }
    public int removeStones(int[][] stones) {
        UnionFind uf = new UnionFind(20000);
        HashSet<Integer> rootSet = new HashSet<>();
        for (int i = 0; i < stones.length; i++) {
            uf.union(stones[i][0], stones[i][1] + 10000);
        }
        for (int i = 0; i < stones.length; i++) {
            rootSet.add(uf.find(stones[i][0]));
        }
        return stones.length - rootSet.size();
    }

    public static void main(String[] args) {
        int[][] stones2 = {{0, 0}};
        assert new RemoveStones().removeStones(stones2) == 0;
        int[][] stones1 = {{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}};
        assert new RemoveStones().removeStones(stones1) == 3;
        int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        assert new RemoveStones().removeStones(stones) == 5;

    }
}
