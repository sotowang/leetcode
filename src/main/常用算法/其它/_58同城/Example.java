package 常用算法.其它._58同城;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
        HashSet<String> originSet = new HashSet<>();
        ArrayList<String> strings = values.get(0);
        for (int i = 0; i < strings.size(); i++) {
            originSet.add(strings.get(i));
        }
        LinkedHashSet<String> curSet = new LinkedHashSet<>();
        for (int i = 1; i < values.size(); i++) {
            strings = values.get(i);
            for (int j = 0; j < strings.size(); j++) {
                if (originSet.contains(strings.get(j))) {
                    curSet.add(strings.get(j));
                }
            }
            originSet = new LinkedHashSet<>(curSet);
            curSet.clear();
        }
        ArrayList<String> resList = new ArrayList<>();
        for (String s : originSet) {
            resList.add(s);
        }
        return resList;
    }


    public static void main(String[] args) {
        /**
         * [["a", "adb", "gae", "ddd", "you", "better", "aaaaa" ],
         * ["a1", "adb", "g2ae", "dd1d", "you", "better", "aaabaa"],
         * ["2a1", "adb2", "g2ae", "ddd", "you", "better", "aaabaa"]]
         */
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "adb", "gae", "ddd", "you", "better", "aaaaa"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a1", "adb", "g2ae", "dd1d", "you", "better", "aaabaa"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("2a1", "adb2", "g2ae", "ddd", "you", "better", "aaabaa"));
        values.add(list1);
        values.add(list2);
        values.add(list3);
        System.out.println(new Example().findCommonString(values));

    }

}
