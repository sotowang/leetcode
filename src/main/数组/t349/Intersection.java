package 数组.t349;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: sotowang
 * @date: 2020/11/03 19:59
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        Set<Integer> resSet = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                resSet.add(nums2[i]);
            }
        }
        Iterator<Integer> it = resSet.iterator();
        int[] nums = new int[resSet.size()];
        int index = 0;
        while(it.hasNext()){
            nums[index++] = it.next();
        }
        return nums;
    }
}
