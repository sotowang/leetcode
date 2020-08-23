package 常用算法.其它.滴滴;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    private static List<int[]> calc(int n) {
        List<int[]> res = new ArrayList<>();
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                if (a == b) {
                    continue;
                }
                for (int c = 0; c <=9 ; c++) {
                    if (a == c || b == c) {
                        continue;
                    }
                    int tem = a * 100 + b * 10 + c + a * 100 + c * 10 + c;
                    if (tem == n) {
                        res.add(new int[]{a * 100 + b * 10 + c, a * 100 + c * 10 + c});
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 100 || n >= 2000) {
            return;
        }
        List<int[]> list = calc(n);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)[0]);
            System.out.print(" ");
            System.out.println(list.get(i)[1]);
        }
    }

}
