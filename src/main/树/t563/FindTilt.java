package 树.t563;

import 广度优先搜索.TreeNode;

import java.util.HashMap;

/**
 * @auther: sotowang
 * @date: 2020/05/17 17:15
 */
public class FindTilt {
    private HashMap<TreeNode,Integer> map = new HashMap<>();
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = findTilt(root.left);
        int right = findTilt(root.right);
        int sum = Math.abs(find(root.left)-find(root.right));
        return sum+left+right;
    }
    private int find(TreeNode root){
        if(root == null){
            return 0;
        }
        if(map.containsKey(root)){
            return map.get(root);
        }
        int left = find(root.left);
        int right = find(root.right);
        map.put(root,root.val + left+right);
        return root.val + left+right;
    }
}
