package 双指针.t27;

/**
 * @auther: sotowang
 * @date: 2019/11/01 20:38
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0 || (nums.length == 1 && nums[0] == val)) {
            return 0;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[left++] = nums[i];
        }
        return left;
    }
}
