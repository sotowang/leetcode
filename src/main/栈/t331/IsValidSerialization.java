package 栈.t331;

/**
 * @auther: sotowang
 * @date: 2020/1/1 16:18
 */
public class IsValidSerialization {
    public boolean isValidSerialization(String preorder) {
        String[] s = preorder.split(",");
        int n0 = 0;
        int n2 = 0;
        for (int i = 0; i < s.length; i++) {
            if ("#".equals(s[i])) {
                n0++;
            } else {
                n2++;
            }
            if (i != s.length - 1 && n0 > n2) {
                return false;
            }
        }
        return n0 == n2 + 1;
    }

    public static void main(String[] args) {
        assert new IsValidSerialization().isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#") == true;
    }
}
