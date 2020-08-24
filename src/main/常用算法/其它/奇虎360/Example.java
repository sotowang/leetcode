package 常用算法.其它.奇虎360;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.charAt(0) == 'n') {
            str = "N" + str.substring(1);
        }
        String[] ss  = str.split("n");
        if (str.length() > 1 && ss.length <= 1) {
            System.out.println(Character.toUpperCase(str.charAt(0)));
            for (int i = 1; i < str.length(); i++) {
                System.out.println(Character.toUpperCase(str.charAt(i)));

            }
            return;
        }
        System.out.println(Character.toUpperCase(ss[0].charAt(0))+ ss[0].substring(1));

        for (int i = 1; i < ss.length; i++) {
            System.out.println('N' + ss[i]);
        }

    }
}
