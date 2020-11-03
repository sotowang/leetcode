package 树.二叉搜索树.t501;

import 广度优先搜索.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sotowang
 * @date: 2020/09/24 13:17
 */
public class FindMode {
    private int max;
    private int pre;
    private int count;
    public int[] findMode(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        inOrder(root,resList);
        int[] res = new int[resList.size()];
        for(int i=0;i<resList.size();i++){
            res[i] = resList.get(i);
        }
        return res;
    }
    private void inOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left,list);
        if(root.val == pre){
            count++;
        }else{
            pre = root.val;
            count = 1;
        }
        if(count == max){
            list.add(root.val);
        }else if(count>max){
            max = count;
            list.clear();
            list.add(root.val);
        }


        inOrder(root.right,list);
    }
}
