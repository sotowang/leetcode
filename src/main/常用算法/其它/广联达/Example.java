package 常用算法.其它.广联达;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String perfect = sc.nextLine();
        String str = sc.nextLine();
        System.out.println(calc(perfect, str));
    }

    private static long calc(String perfect, String str) {
        int index = 0;
        long score = 0;
        while (index < str.length()) {
            if (str.charAt(index) == perfect.charAt(index)) {
                score += 20;
            } else {
                score = Math.max(0, score - 10);
            }
            index++;
        }
        return score;
    }

}
