package 贪心算法.t455;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/2/28 23:08
 */
public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        if (g == null || s == null || g.length == 0 || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);

        int index = 0;
        int count = 0;
        for (int i = 0; i < g.length; i++) {
            while (index < s.length && s[index] < g[i]) {
                index++;
            }
            if (index < s.length && count <= s.length) {
                count++;
                index++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = new int[]{1, 2, 3};
        int[] s = new int[]{3};
        assert new FindContentChildren().findContentChildren(g, s) == 1;
    }
}
