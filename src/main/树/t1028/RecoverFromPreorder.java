package 树.t1028;

import 广度优先搜索.TreeNode;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author: wangsongtao
 * @date: 2020/06/18 23:09
 */
public class RecoverFromPreorder {
    private Map<TreeNode,Integer> map = new LinkedHashMap<>();
    public TreeNode recoverFromPreorder(String S) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        calculate(S);
        for(Map.Entry<TreeNode,Integer> entry:map.entrySet()){
            TreeNode root = entry.getKey();
            while(!stack.isEmpty() && map.get(root)<=map.get(stack.peek())){
                stack.pop();
            }
            if(!stack.isEmpty() && map.get(root) -1 == map.get(stack.peek())){
                if(stack.peek().left == null){
                    stack.peek().left = root;
                }else{
                    stack.peek().right = root;
                }
            }
            stack.push(root);
        }
        return stack.peekLast();
    }
    private void calculate(String s){
        int len = s.length();
        for(int i=0;i<len;){
            int count = 0;
            while(i<len && s.charAt(i) == '-'){
                count++;
                i++;
            }
            int val = 0;
            while(i<len && s.charAt(i) != '-'){
                val = val *10 + (s.charAt(i++)-'0');
            }
            TreeNode root = new TreeNode(val);
            map.put(root,count);
        }
    }

    public static void main(String[] args) {
        String s = "1-2--3--4-5--6--7";
        new RecoverFromPreorder().recoverFromPreorder(s);
    }
}
