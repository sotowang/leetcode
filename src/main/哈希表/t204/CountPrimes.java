package 哈希表.t204;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/11/24 11:34
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        for (int i = 2; i*i <= n; i++) {
            if (isPrim[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrim[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n ; i++) {
            if (isPrim[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes(10));
    }
}
