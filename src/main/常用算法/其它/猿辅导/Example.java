package 常用算法.其它.猿辅导;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {


    private static int check(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > 10) {
                continue;
            }
            boolean flag = true;
            for (int j = 0; j < strs[i].length(); j++) {
                if (!Character.isLetter(strs[i].charAt(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        System.out.println(check(str));
    }

}
