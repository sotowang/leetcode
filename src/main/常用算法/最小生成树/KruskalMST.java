package 常用算法.最小生成树;


import java.util.*;

/**
 * @author: sotowang
 * @date: 2020/08/12 13:26
 * https://www.pdai.tech/md/algorithm/alg-basic-graph-min-tree.html
 */

public class KruskalMST  {

    static class Edge {
        //始边
        int start;
        //终边
        int end;
        //权重
        int weight;

        public Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }
    static class UnionFind{
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n+1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        }
        public void union(int i, int j) {
            int parentI = find(i);
            int parentJ = find(j);
            if (parentI == parentJ) {
                return;
            }
            parent[parentI] = parentJ;
        }

        public int find(int x) {
            while (x != parent[x]) {
                x = parent[parent[x]];
            }
            return x;
        }
    }

    public static int minTree(LinkedList<Edge> edgeList, List<Integer> vertexList) {
        Collections.sort(edgeList, (a, b) -> (a.weight - b.weight));
        UnionFind uf = new UnionFind(vertexList.size());
        int sum = 0;
        int edgeNum = 0;
        while (!edgeList.isEmpty() && edgeNum < vertexList.size() - 1) {
            Edge edge = edgeList.get(0);
            edgeList.poll();
            if (uf.find(edge.start) != uf.find(edge.end)) {
                uf.union(edge.start, edge.end);
                sum += edge.weight;
                edgeNum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Edge edge1 = new Edge(1, 2, 1);
        Edge edge2 = new Edge(1, 5, 1);
        Edge edge3 = new Edge(2, 4, 1);
        Edge edge4 = new Edge(3, 5, 1);
        Edge edge5 = new Edge(4, 5, 2);
        LinkedList<Edge> edgeList = new LinkedList<>();
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);
        edgeList.add(edge4);
        edgeList.add(edge5);
        List<Integer> vertexList = new ArrayList<>();
        vertexList.add(1);
        vertexList.add(2);
        vertexList.add(3);
        vertexList.add(4);
        vertexList.add(5);
        System.out.println(minTree(edgeList, vertexList));
    }
}
