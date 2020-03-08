package 图.t207;

/**
 * @auther: sotowang
 * @date: 2019/11/14 15:53
 */
public class CanFinish {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0 || prerequisites[0] == null || prerequisites[0].length == 0) {
            return true;
        }
        int[] flag = new int[numCourses];
        int[][] adjacency = new int[numCourses][numCourses];
        for (int[] relation :
                prerequisites) {
            adjacency[relation[1]][relation[0]] = 1;
        }

        for (int i = 0; i < numCourses; i++) {
            if (dfs(adjacency, flag, i)) {
                return false;
            }
        }
        return true;


    }

    /**
     * flag =1时,表示已被该点访问,此时表明有环
     * falg = 0时,未被访问
     * flag = -1时,已被别的点访问,此时可退出本次循环
     * @param adjacency
     * @param flag
     * @param i
     * @return  true表示有环,false表示无环
     */
    private boolean dfs(int[][] adjacency, int[] flag, int i) {
        if (flag[i] == 1) {
            return true;
        }
        if (flag[i] == -1) {
            return false;
        }
        flag[i] = 1;
        for (int j = 0; j < adjacency.length; j++) {
            if (adjacency[i][j] == 1 && dfs(adjacency, flag, j)) {
                return true;
            }
        }
        flag[i] = -1;
        return false;
    }

    public static void main(String[] args) {
//        int[][] prerequisites = new int[][]{
//                {1, 0},
//                {3, 0},
//                {3, 1},
//                {2, 1},
//                {4, 2},
//                {4, 3}
//        };
//        System.out.println(new CanFinish().canFinish(5, prerequisites));
        int[][] prerequisites = new int[][]{
                {1, 0},
                {0, 1}
        };
        System.out.println(new CanFinish().canFinish(2, prerequisites));
    }
}
