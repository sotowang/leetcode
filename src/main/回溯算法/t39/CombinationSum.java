package 回溯算法.t39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList();
        if(candidates == null || candidates.length == 0){
            return resList;
        }

        Arrays.sort(candidates);
        backTrack(candidates,target,resList,new ArrayList(),0,target);
        return resList;
    }
    private void backTrack(int[] candidates,int target,
                           List<List<Integer>> resList,List<Integer> temList,int start,int origin){
        if(target ==0){
            resList.add(new ArrayList(temList));
            return;
        }
        for(int i=start;i<candidates.length && candidates[i]<=target;i++){
            temList.add(candidates[i]);
            backTrack(candidates,target-candidates[i],resList,temList,i,origin);
            temList.remove(temList.size()-1);
        }
    }

    public static void main(String[] args) {
//        System.out.println(new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(new CombinationSum().combinationSum(new int[]{8,7,4,3}, 11));

    }
}
