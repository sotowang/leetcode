package 设计.t297;

import 广度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2020/2/27 22:11
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String res = serHelp(root, new StringBuilder()).toString();
        res = res.substring(0, res.length() - 1);
        return res;
    }

    /**
     * 与题目举例不一样,因为这里不限定序列化逻辑
     * @param root
     * @param sb
     * @return
     */
    private StringBuilder serHelp(TreeNode root,StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return sb;
        }
        sb.append(root.val).append(",");
        serHelp(root.left, sb);
        serHelp(root.right, sb);
        return sb;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nums = data.split(",");
        return desHelp(nums, new int[]{0});
    }

    private TreeNode desHelp(String[] nums, int[] start) {
        if (start[0] >= nums.length) {
            return null;
        }
        TreeNode root = null;
        if (!nums[start[0]].equals("null")) {
            root = new TreeNode(Integer.valueOf(nums[start[0]]));
            start[0]++;
            root.left = desHelp(nums, start);
            start[0]++;
            root.right = desHelp(nums, start);
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
