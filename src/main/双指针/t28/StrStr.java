package 双指针.t28;

/**
 * @auther: sotowang
 * @date: 2019/11/01 20:47
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null || haystack.length() == 0) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            //needle指针
            int nIndex = 0;
            if (nIndex < needle.length() && needle.charAt(nIndex) != haystack.charAt(i)) {
                continue;
            }
            int hIndex = i;
            while (hIndex < haystack.length() && nIndex < needle.length() && haystack.charAt(hIndex) == needle.charAt(nIndex)) {
                hIndex++;
                nIndex++;
            }
            if (nIndex == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("hello", "ll"));
        System.out.println(new StrStr().strStr("aaaaa", "bba"));

    }
}
