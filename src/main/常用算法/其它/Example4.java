package 常用算法.其它;

import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/20 9:21
 */
public class Example4 {
    private static long sum = 0;
    private static void dfs(int[][] adj, boolean[] visited,int start) {
        visited[start] = true;
        for (int i = start; i < adj.length; i++) {
            int index = i;
            int max = Integer.MIN_VALUE;
            boolean flag = false;
            for (int j = i + 1; j < adj.length; j++) {
                if (!visited[j] && max<adj[i][j]){
                    max = adj[i][j];
                    index = j;
                    flag = true;
                }
            }
            if (flag) {
                sum += adj[i][index];
                dfs(adj, visited, index);
            }

        }
    }


    private static int facFor(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * facFor(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] adj = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            adj[u][v] = facFor(a) / facFor(b);
            adj[v][u] = adj[u][v];
        }
        boolean[] visited = new boolean[adj.length + 1];
        dfs(adj, visited, 1);
        long res = sum % (1000000000 + 7);
        System.out.println(res);
    }
}

