package 常用算法.其它.腾讯;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(count == k){
                int a = sc.nextInt();
            }else{
                sb.append(sc.nextInt()).append(" ");
            }
            count++;
        }
        String res = sb.toString().trim();
        System.out.println(res);

    }
}
