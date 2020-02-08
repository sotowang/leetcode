package 哈希表.t1342;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/2/8 16:21
 */
public class MinSetSize {
    public int minSetSize(int[] arr) {
        int len = arr.length;
        int halfLen = len / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        int count = 0;
        for (Map.Entry<Integer, Integer> entry :
                list) {
            len -= entry.getValue();
            count++;
            if (len <= halfLen) {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr2 = {1, 9};
        assert new MinSetSize().minSetSize(arr2) == 1;
        int[] arr1 = {7, 7, 7, 7, 7, 7};
        assert new MinSetSize().minSetSize(arr1) == 1;
        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        assert new MinSetSize().minSetSize(arr) == 2;
    }
}
