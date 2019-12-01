package 字符串.t165;

/**
 * @auther: sotowang
 * @date: 2019/12/01 18:12
 */
public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n1 = v1.length;
        int n2 = v2.length;
        for (int i = 0; i < Math.max(n1, n2); i++) {
            int a = (i >= n1) ? 0 : Integer.valueOf(v1[i]);
            int b = (i >= n2) ? 0 : Integer.valueOf(v2[i]);
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new CompareVersion().compareVersion("1.0", "1.0.0"));
        System.out.println(new CompareVersion().compareVersion("1.01", "1.001"));
        System.out.println(new CompareVersion().compareVersion("7.5.2.4", "7.5.3"));
        System.out.println(new CompareVersion().compareVersion("1.0.1", "1"));
        System.out.println(new CompareVersion().compareVersion("0.1", "1.1"));
    }
}
