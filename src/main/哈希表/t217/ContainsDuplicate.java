package 哈希表.t217;

import java.util.HashSet;

/**
 * @auther: sotowang
 * @date: 2019/11/24 19:49
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num :nums) {
            hashSet.add(num);
        }
        return hashSet.size() != nums.length;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums1));
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums2));
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums3));
    }
}
