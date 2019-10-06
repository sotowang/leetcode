package 字节跳动.string.t6;

import java.util.LinkedList;

public class SimplifyPath {
    public String simplifyPath(String path) {
        LinkedList<String> stack = new LinkedList<>();
        String[] s = path.split("/");
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals(".") && !s[i].equals("..") &&!s[i].equals("")) {
                stack.push(s[i]);
            } else if (!stack.isEmpty() && s[i].equals("..")) {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder result = new StringBuilder();
        for (int i =stack.size()-1; i >=0; i--) {
            result.append("/").append(stack.get(i));
        }
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(new SimplifyPath().simplifyPath("/../"));
        System.out.println(new SimplifyPath().simplifyPath("/home/"));
        System.out.println(new SimplifyPath().simplifyPath("/home//foo/"));
        System.out.println(new SimplifyPath().simplifyPath("/a/./b/../../c/"));
        System.out.println(new SimplifyPath().simplifyPath("/a/../../b/../c//.//"));

    }
}
