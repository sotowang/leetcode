package 位运算.t461;

/**
 * @auther: sotowang
 * @date: 2020/01/10 18:58
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        while (z != 0) {
            z = z & (z - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        assert new HammingDistance().hammingDistance(1, 4) == 2;
    }
}
