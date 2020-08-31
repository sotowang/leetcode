package 常用算法.其它._58同城;


/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2  {
    public int question (int a, int b) {
        // write code here
        for (int i = 1; i <= 500; i++) {
            int a1 = i + a;
            int b1 = i + b;
            if (check(a1) && check(b1)) {
                return i;
            }
        }
        return 0;

    }

    private boolean check(int a) {
        int b = (int) Math.sqrt(a);
        return b * b == a;
    }
    public static void main(String[] args){



    }
}
