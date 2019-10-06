package 字节跳动.array.t10;


public class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int peak = 0;
        int count = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i + 1] > nums[i]) {
                count++;
            } else {
                count = 1;
            }
            if (count > peak) {
                peak = count;
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        System.out.println(new FindLengthOfLCIS().findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        System.out.println(new FindLengthOfLCIS().findLengthOfLCIS(new int[]{2,2,2,2,2}));
    }
}
