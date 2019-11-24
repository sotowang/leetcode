package 哈希表.t219;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/11/24 20:02
 */
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i]) && i - hashMap.get(nums[i]) <= k) {
                return true;
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(nums1, 3));
        int[] nums2 = {1, 0, 1, 1};
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(nums2, 1));
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(nums3, 2));
    }
}
