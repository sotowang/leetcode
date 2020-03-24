package 常用算法.其它;

/**
 * @auther: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    public static void main(String[] args) {
        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int)'A');
        System.out.println("".length());

    }

    private static void dfs(String[]  s, int start) {
        StringBuilder sb = new StringBuilder("aa");
        StringBuilder sb2 = new StringBuilder("aa");
        System.out.println(sb.equals(sb2));
    }
}
