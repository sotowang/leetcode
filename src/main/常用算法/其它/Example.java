package 常用算法.其它;


import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:22
 */
public class Example {
    private static boolean check(String s) {
        int len = s.length();
        if (s.charAt(0) < 'A' || s.charAt(0) > 'Z') {
            return false;
        }
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private static String solution(String votes) {
        String[] names = votes.split(",");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            if(!check(names[i])){
                return "error.0001";
            }
            map.put(names[i], map.getOrDefault(names[i], 0) + 1);
        }
        List<String> list = new ArrayList<>(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        int size = list.size();
        if (map.get(list.get(0)) > 99) {
            return "error.0001";
        }
        String res = list.get(0);
        for (int i = 0; i < size-1; i++) {
            if (map.get(list.get(i)) == map.get(list.get(i + 1))) {
                if (res.compareTo(list.get(i + 1)) > 0) {
                    res = list.get(i + 1);
                }
            } else {
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        "Tom,Lily,Tom,Lucy,Lucy,Jack,Amy,Amy,Amy"
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

}
