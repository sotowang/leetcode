package 常用算法.其它.完美世界;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    static boolean isValidPop(LinkedList<Integer> pushList, LinkedList<Integer> popList) {
        if (pushList.size() != popList.size()) {
            return false;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        while (!pushList.isEmpty()) {
            stack.push(pushList.poll());
            while (!stack.isEmpty() && stack.peekFirst().equals(popList.peekFirst())) {
                popList.poll();
                stack.pop();
            }
        }
        if (stack.isEmpty() && popList.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> pushList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            pushList.offer(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList<Integer> popList = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            popList.offer(sc.nextInt());
        }
        System.out.println(isValidPop(pushList, popList));
    }


}
