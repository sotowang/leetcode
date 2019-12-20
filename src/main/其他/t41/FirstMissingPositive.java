package 其他.t41;

/**
 * @auther: sotowang
 * @date: 2019/12/20 10:02
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        //把大于等于1的和小于数组大小的值放到原数组对应位置
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] >= 1 && nums[i] <= nums.length && nums[i] != i + 1 && nums[nums[i]-1]!= nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    public static void main(String[] args) {
        int[] nums4 = {1, 1};
        System.out.println(new FirstMissingPositive().firstMissingPositive(nums4));
        int[] nums3 = {7, 8, 9, 11, 12};
        System.out.println(new FirstMissingPositive().firstMissingPositive(nums3));
        int[] nums2 = {3, 4, -1, 1};
        System.out.println(new FirstMissingPositive().firstMissingPositive(nums2));
        int[] nums1 = {1, 2, 0};
        System.out.println(new FirstMissingPositive().firstMissingPositive(nums1));
    }
}
