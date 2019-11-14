package 拓扑排序.t210;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2019/11/14 20:06
 */
public class FindOrder {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> res = new ArrayList<>();
        //保存结点的入度
        int[] degree = new int[numCourses];
        //邻接表
        int[][] adjacency = new int[numCourses][numCourses];
        Queue<Integer> queue = new LinkedList();
        for (int[] relation :
                prerequisites) {
            //构造邻接表
            adjacency[relation[1]][relation[0]] = 1;
            //计算结点入度数
            degree[relation[0]]++;
        }
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (degree[cur] == 0) {
                //删除节点指向的边
                res.add(cur);
                for (int j = 0; j < numCourses; j++) {
                    if (adjacency[cur][j] == 1) {
                        adjacency[cur][j] = 0;
                        degree[j]--;
                        if (degree[j] == 0) {
                            queue.offer(j);
                        }
                    }
                }
            }
        }
        if (res.size() < numCourses) {
            return new int[]{};
        }
        return res.stream().mapToInt(e-> e.intValue()).toArray();

    }

    public static void main(String[] args) {
//        int[][] prerequisites = new int[][]{
//                {1, 0},
//                {2, 0},
//                {3, 1},
//                {3, 2}
//        };
//        int[] res = new FindOrder().findOrder(4, prerequisites);
//        Arrays.stream(res).forEach(System.out::println);


        int[][] prerequisites = new int[][]{
        };
        int[] res = new FindOrder().findOrder(2, prerequisites);
        Arrays.stream(res).forEach(System.out::println);


//        int[][] prerequisites = new int[][]{
//                {0,1}
//        };
//        int[] res = new FindOrder().findOrder(2, prerequisites);
//        Arrays.stream(res).forEach(System.out::println);

    }
}
