package 常用算法.其它.腾讯;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(subString( str, k));
    }

    private static String subString(String str, int k) {
        PriorityQueue<String> maxHeap = new PriorityQueue<>(k, (a, b) -> (b.compareTo(a)));
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String tem = str.substring(i, j);
                if (!set.add(tem)) {
                    continue;
                }
                if (maxHeap.size() < k) {
                    maxHeap.offer(tem);
                }else{
                    if (maxHeap.peek().compareTo(tem) > 0) {
                        maxHeap.poll();
                        maxHeap.offer(tem);
                    } else {
                        break;
                    }
                }
            }
        }

        return maxHeap.peek();
    }

}
