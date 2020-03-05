package 数组.两数之和类.t167;

/**
 * @auther: sotowang
 * @date: 2019/11/03 22:24
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            if (numbers[low] + numbers[high] == target) {
                return new int[]{low + 1, high + 1};
            }
            int i = numbers[low] + numbers[high] > target ? high-- : low++;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numsbers = new int[]{2, 7, 11, 15};
        int[] res = new TwoSum().twoSum(numsbers, 9);
        for (int r : res
        ) {
            System.out.print(r + ",");
        }
    }
}
