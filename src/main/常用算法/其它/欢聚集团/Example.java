package 常用算法.其它.欢聚集团;


/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    public long nextNarcissisticNumber (int n) {
        // write code here
        while (!check(n+1)) {
            n++;
        }
        return n + 1;
    }

    private boolean check(int n) {
        int bit = String.valueOf(n).length();
        int origin = n;
        long sum = 0;
        while (n != 0) {
            long tem = n % 10;
            sum += Math.pow(tem, bit);
            n = n / 10;
        }
        return sum == origin;
    }

    public static void main(String[] args) {
        System.out.println(new Example().nextNarcissisticNumber(8));
    }




}
