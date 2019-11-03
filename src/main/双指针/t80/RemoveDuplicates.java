package 双指针.t80;

/**
 * @auther: sotowang
 * @date: 2019/11/03 20:30
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        //新数组中有效位置最后一位
        int current = 1;
        //前两个元素是不用删除的
        int start = 2;
        for (int i = 2; i < nums.length; i++) {
            //以前一位的前一位比较
            if (nums[i] == nums[current - 1]) {
                continue;
            }
            nums[++current] = nums[i];
        }
        return current + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));

    }
}
