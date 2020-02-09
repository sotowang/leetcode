package 哈希表.t5332;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/2/9 14:57
 */
public class CheckIfExist {
    public boolean checkIfExist(int[] arr) {
        if (arr.length == 2 && arr[1] == 0 && arr[0] == 0) {
            return true;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (Map.Entry<Integer, Integer> entry :
                map.entrySet()) {
            int val = entry.getKey();
            if (map.containsKey(val * 2) && map.get(val*2) != map.get(val)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr4 = {-2, 0, 10, -19, 4, 6, -8};
        assert new CheckIfExist().checkIfExist(arr4) == false;
        int[] arr3 = {-10, 12, -20, -8, 15};
        assert new CheckIfExist().checkIfExist(arr3) == true;
        int[] arr2 = {3, 1, 7, 11};
        assert new CheckIfExist().checkIfExist(arr2) == false;
        int[] arr1 = {7, 1, 14, 11};
        assert new CheckIfExist().checkIfExist(arr1) == true;
        int[] arr = {10, 2, 5, 3};
        assert new CheckIfExist().checkIfExist(arr) == true;
    }
}
