package byteDance.array.t9;

public class Search {
    int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if ((nums[0] > target) ^ (nums[0] > nums[mid]) ^ (target > nums[mid]))
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo == hi && nums[lo] == target ? lo : -1;
    }

    public static void main(String[] args) {
//        System.out.println(new Search().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        System.out.println(new Search().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
