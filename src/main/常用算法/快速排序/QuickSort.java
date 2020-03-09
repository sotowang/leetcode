package 常用算法.快速排序;

/**
 * @auther: sotowang
 * @date: 2020/3/9 21:29
 */
public class QuickSort {
    public void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int i=low;
        int j=high;
        int piv = nums[i];
        while (i < j) {
            while (i < j && nums[j] > piv) {
                j--;
            }
            if (i < j) {
                nums[i++] = nums[j];
            }
            while (i < j && nums[i] < piv) {
                i++;
            }
            if (i < j) {
                nums[j--] = nums[i];
            }
        }
        nums[i] = piv;
        quickSort(nums, low, i - 1);
        quickSort(nums, i + 1, high);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 3, 3, 4, 3, 8, 9, 10, 11};
        new QuickSort().quickSort(nums, 0, 8);
        for (int num :
                nums) {
            System.out.print(num + ",");
        }
    }
}
