package 字符串.t6;


/**
 * @auther: sotowang
 * @date: 2019/11/28 20:23
 */
public class Convert {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] strs = new StringBuilder[numRows];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = new StringBuilder();
        }

        int count = 0;
        boolean down = true;
        for (char  c: s.toCharArray()) {
            strs[count].append(c);
            if (down && count < numRows-1) {
                count++;
            } else if (down && count == numRows-1) {
                down = !down;
                count--;
                continue;
            }
            if (!down && count > 0) {
                count--;
            } else if (!down && count == 0) {
                down = !down;
                count++;
                continue;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            res.append(strs[i]).toString();
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Convert().convert("LEETCODEISHIRING", 3));
    }
}
