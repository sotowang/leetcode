package 数组.t1365;

/**
 * @author: sotowang
 * @date: 2020/11/10 18:42
 */
public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];
        for(int i=0;i<nums.length;i++){
            bucket[nums[i]]++;
        }
        int tem = 0;
        int pre = 0;
        int[] res = new int[nums.length];
        for(int i=0;i<=100;i++){
            tem = bucket[i];
            bucket[i] = pre;
            pre += tem;
        }
        for(int i=0;i<res.length;i++){
            res[i] = bucket[nums[i]];
        }
        return res;

    }
}
