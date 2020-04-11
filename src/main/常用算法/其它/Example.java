package 常用算法.其它;

import 华为笔试.April_8th.Solution;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:22
 */
public class Example {
    private static long solution(List<Long> list) {
        Collections.sort(list);
        long cost = 0;
        int size = list.size();
        while (size>=3){
            size--;
            cost += list.get(size);
            size--;
            cost += list.get(size);
            size--;
        }
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                cost += list.get(i);
            }
        }
        return cost;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            list.add(sc.nextLong());
        }
        System.out.println(solution(list));
    }

}
