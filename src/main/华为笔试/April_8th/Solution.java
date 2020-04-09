package 华为笔试.April_8th;

/**
 * @auther: sotowang
 * @date: 2020/4/9 17:11
 */
public class Solution {
    public static String  change(String s){
        boolean flag = true;
        while (flag){
            if (s.contains("00") || s.contains("010")) {
                s = s.replace("00", "10");
                s = s.replace("010", "101");
            } else {
                flag = false;
            }
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(change("10"));
        System.out.println(change("0001"));
        System.out.println(change("11111"));
        System.out.println(change("0111110"));
    }
}
