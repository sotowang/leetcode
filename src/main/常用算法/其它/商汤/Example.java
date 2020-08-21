package 常用算法.其它.商汤;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    public static int countGood(String str) {
        if (str.length() < 4) {
            return 0;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'G' || c == 'o' || c == 'd') {
                sb.append(c);
            }
        }
        str = sb.toString();
        while (str.contains("Good")) {
            count++;
            str = str.replaceFirst("Good", "");
        }
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(i) && map.get(i)) {
                continue;
            }
            boolean flag = true;
            char c = str.charAt(i);
            if (c == 'G') {
                for (int j = i+1; j < str.length() && flag;  j++) {
                    if (!map.getOrDefault(j,false) && str.charAt(j) == 'o') {
                        for (int k = j+1 ; k < str.length() && flag; k++) {
                            if (!map.getOrDefault(k,false) && str.charAt(k) == 'o') {
                                for (int l = k+1; l < str.length() && flag; l++) {
                                    if (!map.getOrDefault(l,false) && str.charAt(l) == 'd') {
                                        count++;
                                        flag = false;
                                        map.put(i, true);
                                        map.put(j, true);
                                        map.put(k, true);
                                        map.put(l, true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    private static boolean findChar(LinkedList<Character> list, char c,boolean isDelete) {
        boolean flag = true;
        int index = 0;
        while (flag && !list.isEmpty()) {
            if (list.get(index) == c) {
                flag = false;
                list.remove(index);
                index--;
            } else {
                if (isDelete) {
                    list.remove(index);
                    index--;
                }
            }

            index++;
        }
        return !flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String s = "GGG".replaceFirst("G", "");
        System.out.println(countGood(str));
//        System.out.println(solution(str,n));
    }

}
