package 排序.t220;

import java.util.TreeSet;

/**
 * @auther: sotowang
 * @date: 2019/10/28 21:11
 */
public class ContainsNearbyAlmostDuplicate {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0 || t < 0) {
            return false;
        }
        TreeSet<Long> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            //查找小于nums[i]+t的最大元素是否存在
            //可能会超出Integer范围,故为Long
            Long floor = treeSet.floor((long) nums[i] + t);
            if (floor != null && floor >= nums[i]) {
                return true;
            }
            //查找大于nums[i]-t的最小元素是否存在
            Long celling = treeSet.ceiling((long) nums[i] - t);
            if (celling != null && celling <= nums[i]) {
                return true;
            }

            //将nums[i]加入二叉搜索树
            treeSet.add((long)nums[i]);

            //限制索引搜索范围为k
            if (treeSet.size() > k) {
                treeSet.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 1};
//        int[] nums = {1, 2, 3, 1};
        int[] nums = {-2147483648,-2147483647};
        System.out.println(new ContainsNearbyAlmostDuplicate().containsNearbyAlmostDuplicate(nums, 3, 3));
    }
}
