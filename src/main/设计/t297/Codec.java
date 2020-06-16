package 设计.t297;

import 广度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2020/2/27 22:11
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        serHelp(root,res);
        // System.out.println(res.toString());
        return res.toString();

    }
    private void serHelp(TreeNode root,StringBuilder tem){
        if(root == null){
            tem.append("null,");
            return;
        }
        tem.append(root.val).append(",");
        serHelp(root.left,tem);
        serHelp(root.right,tem);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        return desHelp(s,new int[]{0});
    }
    private TreeNode desHelp(String[] s,int[] index){
        if(index[0] == s.length){
            return null;
        }
        TreeNode root = null;
        if(!s[index[0]].equals("null")){
            root = new TreeNode(Integer.valueOf(s[index[0]]));
            index[0]++;
            root.left = desHelp(s,index);
            index[0]++;
            root.right = desHelp(s,index);

        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, null), new TreeNode(3,
                new TreeNode(4, null, null), new TreeNode(5, null, null)));
        System.out.println(new Codec().serialize(root));
        TreeNode res = new Codec().deserialize("1,2,null,null,3,4,null,null,5,null,null");
        System.out.println(res);
    }
}
