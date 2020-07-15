package 数组.t350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/07/15 23:43
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums2 == null || nums1 == null||nums1.length == 0|| nums2.length == 0){
            return new int[]{};
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1<len2){
            return  commonPart(nums1,nums2);
        }else{
            return commonPart(nums2,nums1);
        }

    }
    private int[] commonPart(int[] nums1,int[] nums2){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list=  new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.getOrDefault(nums2[i],0) >0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
