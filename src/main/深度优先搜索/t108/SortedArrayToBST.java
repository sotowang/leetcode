package 深度优先搜索.t108;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/06 20:33
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return toBST(nums, 0, nums.length - 1);
    }

    private TreeNode toBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) >> 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums, left, mid - 1);
        root.right = toBST(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode root = new SortedArrayToBST().sortedArrayToBST(nums);
    }
}
