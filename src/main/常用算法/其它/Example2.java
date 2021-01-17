package 常用算法.其它;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2  {
    static class Man implements  Comparable<Man>{
        int id;
        int sumScore;
        int[] score = new int[11];

        @Override
        public int compareTo(Man o) {
            if (sumScore > o.sumScore) {
                return 1;
            } else if (sumScore < o.sumScore) {
                return -1;
            }else{
                for (int i = 0; i < score.length; i++) {
                    if (score[i] > o.score[i]) {
                        return 1;
                    }
                }
                return 0;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cnts = sc.next().split(",");
        int m = Integer.valueOf(cnts[0]);
        int n = Integer.valueOf(cnts[1]);
        Man[] man = new Man[n];
        for (int i = 0; i < man.length; i++) {
            man[i] = new Man();
            man[i].id = i + 1;
        }
        for (int i = 0; i < m; i++) {
            String[] scores  = sc.next().split(",");
            for (int j = 0; j < scores.length; j++) {
                man[j].sumScore += Integer.valueOf(scores[j]);
                man[j].score[j]++;
            }
        }
        Arrays.sort(man);
        StringBuilder sb = new StringBuilder();

        sb.append(man[n-1].id).append(",").append(man[n-2].id).append(",").append(man[n-3].id);
        System.out.println(sb.toString());
    }
}
//4,5
//10,6,9,7,6
//9,10,6,7,5
//8,10,6,5,10
//9,10,8,4,9
