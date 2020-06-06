package 字节跳动.数组.t128;

import java.util.HashSet;
import java.util.Set;

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

    public static void main(String[] args) {
        System.out.println(new LongestConsecutive().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
