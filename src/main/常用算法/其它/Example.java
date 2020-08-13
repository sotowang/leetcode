package 常用算法.其它;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    private static int solution(String str, int n) {
        int left = 0;
        int right = n-1;
        int count = 0;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                count++;
            }
            left++;
            right--;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(str,n));
    }

}
