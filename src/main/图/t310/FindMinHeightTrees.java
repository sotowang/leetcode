package 图.t310;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @auther: sotowang
 * @date: 2020/3/8 18:49
 */
public class FindMinHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList();
        if (edges == null || edges.length == 0 || edges[0] == null || edges[0].length == 0) {
            res.add(0);
            return res;
        }
        int[] degree = new int[n];
        //邻接表
        boolean[][] adj = new boolean[n][n];
        //构造图
        for (int i = 0; i < edges.length; i++) {
            degree[edges[i][0]]++;
            degree[edges[i][1]]++;
            adj[edges[i][1]][edges[i][0]] = true;
            adj[edges[i][0]][edges[i][1]] = true;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        while (n > 2) {
            //找到度为1的点
            for (int i = 0; i < degree.length; i++) {
                if (degree[i]==1) {
                    queue.offer(i);
                    degree[i] = 0;
                    n--;
                }
            }
            if (n <= 2) {
                break;
            }
            //每次删除度为1的叶节点
            while (!queue.isEmpty()) {
                int vertex = queue.poll();
                for (int i = 0; i < adj[0].length; i++) {
                    if (adj[vertex][i]) {
                        adj[vertex][i] = false;
                        adj[i][vertex] = false;
                        degree[i]--;
                    }
                }
            }
        }

        for (int i = 0; i < degree.length; i++) {
            if (degree[i] >= 1) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] edges1 = new int[][]{
                {1, 0},
                {1, 2},
                {2, 3},
                {4, 3},
        };
        //2
        System.out.println(new FindMinHeightTrees().findMinHeightTrees(5, edges1));
        int[][] edges = new int[][]{
                {1, 0},
                {1, 2},
                {1, 3},
        };
        //1
        System.out.println(new FindMinHeightTrees().findMinHeightTrees(4, edges));
    }
}
