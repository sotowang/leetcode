package 树.t95;

import 深度优先搜索.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/11/25 20:16
 */
public class GenerateTrees {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return new ArrayList();
        }
        List<TreeNode> resList =  dfs(1,n);
        return resList;
    }
    private List<TreeNode> dfs(int start,int end){
        ArrayList<TreeNode> list = new ArrayList<>();
        if(start > end){
            list.add(null);
            return list;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> leftNodes = dfs(start,i-1);
            List<TreeNode> rightNodes = dfs(i+1,end);
            for(TreeNode left:leftNodes){
                for(TreeNode right:rightNodes){
                    TreeNode root = new TreeNode(i);

                    root.left = left;
                    root.right = right;
                    list.add(root);
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        List<TreeNode> res = new GenerateTrees().generateTrees(3);
        for (TreeNode root : res
        ) {
            System.out.println(root.val);
        }
    }
}
