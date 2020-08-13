package 常用算法.其它.bilibili;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    public int GetCoinCount(int N) {
        // write code here
        int sum = 1024 - N;
        int[] coins = {64, 16, 4, 1};
        int count = 0;
        while (sum > 0) {
            while (sum >= coins[0]) {
                count += sum / coins[0];
                sum %= coins[0];
            }
            while (sum >= coins[1]) {
                count += sum / coins[1];
                sum %= coins[1];
            }
            while (sum >= coins[2]) {
                count += sum / coins[2];
                sum %= coins[2];
            }
            while (sum >= coins[3]) {
                count += sum / coins[3];
                sum %= coins[3];
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }


}
