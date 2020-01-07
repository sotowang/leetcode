package 贪心算法.t406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/01/07 21:21
 */
public class ReconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> res = new ArrayList<>(people.length);
        if (people == null || people.length == 0) {
            return res.toArray(new int[people.length][]);
        }
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ?a[1] -b[1] : b[0] - a[0]));
        for (int i = 0; i < people.length; i++) {
            res.add(people[i][1], people[i]);
        }
        return res.toArray(new int[people.length][2]);
    }

    public static void main(String[] args) {
        int[][] people1 = {
                {9, 0}, {7, 0}, {1, 9}, {3, 0}, {2, 7}, {5, 3}, {6, 0}, {3, 4}, {6, 2}, {5, 2}
        };
        int[][] res1 = new ReconstructQueue().reconstructQueue(people1);
        Arrays.stream(res1).forEach(e -> System.out.print("[" + e[0] + "," + e[1] + "]" + ","));


        System.out.println();
        int[][] people = {
                {7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1},{5, 2}
        };
        int[][] res = new ReconstructQueue().reconstructQueue(people);
        Arrays.stream(res).forEach(e -> System.out.print("[" + e[0] + "," + e[1] + "]" + ","));
    }
}
