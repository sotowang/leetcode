package 树.t654;

import 广度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2020/05/06 19:40
 */
public class ConstructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
    private TreeNode construct(int[] nums,int start,int end){
        if(start>end || start<0 || end>= nums.length){
            return null;
        }
        int index = findMaxIndex(nums,start,end);
        TreeNode root = new TreeNode(nums[index]);
        root.left = construct(nums,start,index-1);
        root.right = construct(nums,index+1,end);
        return root;
    }
    private int findMaxIndex(int[] nums,int m,int n){
        int max = nums[m];
        int index = m;
        for(int i=m;i<=n;i++){
            if(max<nums[i]){
                index = i;
                max = nums[i];
            }
        }
        return index;
    }
}
