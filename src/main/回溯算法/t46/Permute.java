package 回溯算法.t46;

import java.util.ArrayList;
import java.util.List;

public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        permute2(nums,visited,new ArrayList(),res,0);
        return res;
    }
    private void permute2(int[] nums,boolean[] visited,List<Integer> tem,
                          List<List<Integer>> res,int size){
        if(size == nums.length){
            res.add(new ArrayList(tem));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                tem.add(nums[i]);
                visited[i] = true;
                permute2(nums,visited,tem,res,size+1);
                visited[i] = false;
                tem.remove(size);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> result = new Permute().permute(new int[]{1, 2, 3});
        System.out.println(result);
    }
}
