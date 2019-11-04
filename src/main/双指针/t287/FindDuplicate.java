package 双指针.t287;

/**
 * @auther: sotowang
 * @date: 2019/11/04 15:47
 */
public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int fast = nums[nums[nums[0]]];
        int slow = nums[nums[0]];
        while (fast != slow) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        //当fast与slow相遇时,别设第三个指针开始走
        int third = nums[0];
        while (third != slow) {
            third = nums[third];
            slow = nums[slow];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 4, 2, 2};
        System.out.println(new FindDuplicate().findDuplicate(nums1));
        int[] nums = new int[]{3, 1, 3, 4, 2};
        System.out.println(new FindDuplicate().findDuplicate(nums));
    }
}
