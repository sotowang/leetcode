package 数组.t384;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/2 16:00
 */
public class Solution {
    private int[] res;
    private int[] originNums;
    public Solution(int[] nums) {
        this.originNums = nums;
        res = Arrays.copyOf(nums, nums.length);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
         res = Arrays.copyOf(originNums, originNums.length);
        return res;

    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> list = new ArrayList<>();
        for(int i:res){
            list.add(i);
        }
        for(int i = 0; i < res.length; i++){
            int index = (int)(Math.random()*list.size());
            res[i] = list.remove(index);
        }
        return res;

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Solution solution = new Solution(nums);
        Arrays.stream(solution.shuffle()).forEach(System.out::print);
        System.out.println();
        Arrays.stream(solution.reset()).forEach(System.out::print);
        System.out.println();
        Arrays.stream(solution.shuffle()).forEach(System.out::print);

    }
}
