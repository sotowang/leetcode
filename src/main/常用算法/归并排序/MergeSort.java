package 常用算法.归并排序;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/4/24 13:39
 */
//https://blog.csdn.net/jianyuerensheng/article/details/51262984
public class MergeSort {
    private void merge(int[] nums, int low, int high) {
        int mid = low + ((high - low) >> 1);
        int[] tem = new int[high - low + 1];
        int index = 0;
        int left = low;
        int right = mid + 1;
        //合并low到high
        while (left <= mid && right <= high) {
            if (nums[left] > nums[right]) {
                tem[index++] = nums[right++];
            } else {
                tem[index++] = nums[left++];
            }
        }
        while (left <= mid) {
            tem[index++] = nums[left++];
        }
        while (right <= high) {
            tem[index++] = nums[right++];
        }

        for (int i = 0; i < tem.length; i++) {
            nums[low++] = tem[i];
        }
    }

    public void mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + ((high - low) >> 1);
        //左边
        mergeSort(nums, low, mid);
        //右边
        mergeSort(nums, mid + 1, high);
        //左右归并
        merge(nums, low, high);
    }

    public static void main(String[] args) {
        int[] nums = {7, 5, 6, 4, 6, 3, 4, 5, 2, 4, 5, 6, 7, 8, 22};
        int low = 0;
        int high = nums.length - 1;
        new MergeSort().mergeSort(nums, low, high);
        Arrays.stream(nums).forEach((e) -> {
            System.out.print(e + ",");
        });

    }
}
