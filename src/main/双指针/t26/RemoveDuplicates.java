package 双指针.t26;

/**
 * @auther: sotowang
 * @date: 2019/11/01 20:05
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[left] == nums[i]) {
                continue;
            }
            nums[++left] = nums[i];
        }
        //left比实际长度少1
        return left + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));

    }
}
