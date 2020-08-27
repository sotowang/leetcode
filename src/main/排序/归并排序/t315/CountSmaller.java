package 排序.归并排序.t315;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: sotowang
 * @date: 2020/08/27 14:03
 */
public class CountSmaller {
    public List<Integer> countSmaller(int[] nums) {
        int[] smallNum = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, smallNum);
        List<Integer> resList = new ArrayList<>(smallNum.length);
        Arrays.stream(smallNum).forEach(e -> resList.add(e));
        return resList;
    }

    private void mergeSort(int[] nums, int left, int right, int[] smallNum) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left >> 1);
        mergeSort(nums, left, mid, smallNum);
        mergeSort(nums, mid + 1, right, smallNum);
        merge(nums, left, right, mid, smallNum);

    }

    private void merge(int[] nums, int left, int right, int mid, int[] smallNum) {
        int low = left;
        int high = mid + 1;
        int[] tem = new int[right - left + 1];
        int index = 0;
        while (low <= mid && high <= right) {
            if (nums[low] <= nums[high]) {
                tem[index++] = nums[low++];
            } else {
                for (int i = low; i <=mid; i++) {
                    smallNum[i] += 1;
                }
                tem[index++] = nums[high++];
            }
        }
        while (low <= mid) {
            tem[index++] = nums[low++];
        }
        while (high <= right) {
            tem[index++] = nums[high++];
        }
        for (int i = 0; i < tem.length; i++) {
            nums[left++] = tem[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        System.out.println(new CountSmaller().countSmaller(nums));
    }
}
