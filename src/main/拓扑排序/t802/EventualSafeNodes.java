package 拓扑排序.t802;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/7 20:23
 */
public class EventualSafeNodes {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        //记录入度
        int[] inDegree = new int[graph.length];
        //记录入度为0的点
        LinkedList<Integer> queue = new LinkedList<>();
        //构建邻接表,用数组会超内存，使用HashMap
        HashMap<Integer, List<Integer>> adjMap = new HashMap<>();
        boolean[] isSafe = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            inDegree[i] = graph[i].length;
            //将入度为0 的点加入队列
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
            //邻接表
            for (int j = 0; j < graph[i].length; j++) {
                List adjList = adjMap.getOrDefault(graph[i][j],new ArrayList<>());
                adjList.add(i);
                adjMap.put(graph[i][j], adjList);
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            //在队列中删除入度为0的点
            int node = queue.poll();
            isSafe[node] = true;
            List<Integer> adjList = adjMap.get(node);
            if (adjList != null) {
                for (int i = 0; i < adjList.size(); i++) {
                    inDegree[adjList.get(i)]--;
                    if (inDegree[adjList.get(i)] == 0) {
                        queue.offer(adjList.get(i));
                    }
                }
            }
        }
        for (int i = 0; i < isSafe.length; i++) {
            if (isSafe[i]) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        System.out.print(new EventualSafeNodes().eventualSafeNodes(graph));
    }
}
