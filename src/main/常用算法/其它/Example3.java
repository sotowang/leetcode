package 常用算法.其它;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    static String res = "";
    static int count = 0;
    private static void change(char[] cs, int k) {
        int len = cs.length;
        HashSet<Character> set = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        //记录应该变成谁
        List<String> resList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < len; j++) {
            list.add(j);
        }
        for (int i = 0; i < len; i++) {
            if (!set.contains(cs[i])) {
                set.add(cs[i]);
                int cost = 0;
                List<Object> list1 = sort(list, cs, k, i);
                cost = (int) list1.get(0);
                if (cost < min) {
                    if (resList.size() > 0) {
                        resList.remove(resList.size() - 1);
                    }
                    resList.add((String) list1.get(1));
                    min = cost;
                } else if (cost == min) {
                    resList.add((String) list1.get(1));
                }
            }
        }
        Collections.sort(resList, (a, b) -> (a.compareTo(b)));
        res = resList.get(0);
        count = min;
    }

    private static List sort(List<Integer> list, char[] cs, int k, int j) {
        Collections.sort(list, (a, b) -> (Math.abs(cs[a]-cs[j]) - Math.abs(cs[b]-cs[j])));
        int cost = 0;
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        List<Integer> temList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            cost += Math.abs(cs[list.get(i)] - cs[j]);
            set.add(list.get(i));
            temList.add(list.get(i));

        }
        int size = list.size();
        while (k<size && Math.abs(cs[list.get(k-1)]-cs[j] ) == Math.abs(cs[list.get(k)]-cs[j]) && cs[j]>cs[list.get(k)] ) {
            set.remove(Integer.valueOf(list.get(k - 1)));
            set.add(list.get(k));
            k++;
        }
        for (int i = 0; i < cs.length; i++) {
            if (set.contains(i)) {
                sb.append(cs[j]);
            } else {
                sb.append(cs[i]);
            }
        }
        List<Object> res = new ArrayList<>();
        res.add(cost);
        res.add(sb.toString());
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
//        String ss = "787585";
        String ss = sc.next();
        char[] cs = ss.toCharArray();
        change(cs, k);
        System.out.println(count);
        System.out.println(res);
    }


}
