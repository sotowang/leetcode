package 常用算法.其它;


import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:22
 */
public class Example {
    private static String find(String s){
        int len = s.length();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                list.add(Integer.valueOf(c-'0'));
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int num :
                list) {
            sb.append(num);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(find(s));

    }

}
