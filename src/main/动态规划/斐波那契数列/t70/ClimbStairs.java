package 动态规划.斐波那契数列.t70;

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int one = 1;
        int two = 2;

        for (int i = 3; i <= n; i++) {
            int third = one + two;
            one = two;
            two = third;
        }
        return two;
    }

    public static void main(String[] args) {
        System.out.println(new ClimbStairs().climbStairs(5));
    }
}
