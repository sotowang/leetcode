package 回溯算法.t491;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/05/05 21:14
 */
public class FindSubsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrace(nums,0,new LinkedList<>(),res);
        return res;
    }
    private void backTrace(int[] nums,int start,LinkedList<Integer> list,List<List<Integer>> res){
        if(list.size()>1){
            res.add(new ArrayList<>(list));
        }
        Set<Integer> set = new HashSet<>();
        for(int i=start;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            if(list.isEmpty() || nums[i]>=list.getLast()){
                set.add(nums[i]);
                list.add(nums[i]);
                backTrace(nums,i+1,list,res);
                list.removeLast();
            }

        }

    }
}
