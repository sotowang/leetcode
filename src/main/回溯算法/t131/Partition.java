package 回溯算法.t131;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Partition {
    public List<List<String>> partition(String s) {
        List result = new ArrayList();
        if (s == null || s.length() == 0) {
            return result;
        }
        getPartition(s, 0, new ArrayList<String>(), result);
        return result;
    }

    private void getPartition(String str, int start, ArrayList path, List result) {
        if (start == str.length()) {
            result.add(new ArrayList<>(path));
        }

        for (int i = start; i < str.length(); i++) {
            StringBuilder checkStr = new StringBuilder(str.substring(start, i + 1));
            if (isPalindrome(checkStr.toString())) {
                path.add(checkStr.toString());
                getPartition(str, i + 1, path, result);
                path.remove(path.size() - 1);
            }
        }

    }

    private boolean isPalindrome(String str) {
        int low = 0;
        int high = str.length()-1;
        while (low < high) {
            if (str.charAt(low) == str.charAt(high)) {
                low++;
                high--;
            } else {
                break;
            }
        }
        return low >= high ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(new Partition().partition("aab"));
//        System.out.println(new Partition().isPalindrome("aa"));

    }
}
