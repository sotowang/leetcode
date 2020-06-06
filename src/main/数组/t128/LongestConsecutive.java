package 数组.t128;

/**
 * @auther: sotowang
 * @date: 2020/06/06 14:32
 */
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int n:nums){
            if(!set.contains(n)){
                continue;
            }
            int left = n-1;
            int right = n+1;
            int count = 1;
            while(set.remove(left--)){
                count++;
                //set.remove(left+1);
            }
            while(set.remove(right++)){
                count++;
                //set.remove(right-1);
            }
            res = Math.max(count,res);
        }
        return res;
    }
}
