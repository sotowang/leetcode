package 树.t1305;

import 广度优先搜索.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/4/20 17:30
 */
public class GetAllElements {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = inOrder(root1);
        List<Integer> list2 = inOrder(root2);
        List<Integer> res = new LinkedList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        while(size1>0 || size2>0){
            if(size1>0 && size2>0){
                if(list1.get(size1-1)>list2.get(size2-1)){
                    res.add(0,list1.get(size1-1));
                    size1--;
                }else{
                    res.add(0,list2.get(size2-1));
                    size2--;
                }
            }else if(size1>0){
                res.add(0,list1.get(--size1));
            }else if(size2>0){
                res.add(0,list2.get(--size2));
            }
        }
        return res;
    }
    private List<Integer> inOrder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;

        while(!stack.isEmpty() || p != null){
            if(p!=null){
                stack.push(p);
                p =p.left;
            }else if(!stack.isEmpty()){
                p = stack.pop();
                //System.out.print(p.val);
                list.add(p.val);
                p = p.right;
            }
        }
        return list;

    }
}
