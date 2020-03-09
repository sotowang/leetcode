package 常用算法.冒泡排序;

/**
 * @auther: sotowang
 * @date: 2020/3/9 21:39
 */
public class BubbleSort {
    public void bubbleSort(int[] nums) {
        boolean flag = true;
        int len = nums.length;
        while (flag) {
            for (int i = 1; i < len; i++) {
                flag = false;
                if (nums[i] < nums[i - 1]) {
                    swap(nums, i, i - 1);
                    flag = true;
                }
            }
            //每次交换完成后会确定最后一个位置
            len--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 67, 2};
        new BubbleSort().bubbleSort(nums);
        for (int num :
                nums) {
            System.out.print(num + ",");
        }
    }
}
