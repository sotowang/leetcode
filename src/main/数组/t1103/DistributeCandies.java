package 数组.t1103;

/**
 * @auther: sotowang
 * @date: 2020/3/9 15:17
 */
public class DistributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int add = 1;
        while (candies > 0) {
            for (int i = 0; i < num_people && candies > 0; i++) {
                candies -= add;
                res[i] += Math.min(add, candies);
                add++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new DistributeCandies().distributeCandies(7, 4);
    }
}
