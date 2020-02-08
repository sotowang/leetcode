package 数组.t1341;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/8 15:26
 */
public class kWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        List<Integer> tem = new ArrayList<>(mat.length);
        int[] numOf1 = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            tem.add(i);
            numOf1[i] = numOf1(mat[i]);
        }
        tem.sort((a, b) -> (numOf1[a] - numOf1[b]));
        for (int i = 0; i < k; i++) {
            res[i] = tem.get(i);
        }
        return res;
    }

    private int numOf1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                break;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] mat2 = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1}
        };
        //123
        Arrays.stream(new kWeakestRows().kWeakestRows(mat2, 3)).forEach(System.out::print);
        System.out.println();
        int[][] mat1 = {
                {1, 0},
                {1, 0},
                {1, 0},
                {1, 1}
        };
        //0123
        Arrays.stream(new kWeakestRows().kWeakestRows(mat1, 4)).forEach(System.out::print);
        System.out.println();
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        //203
        Arrays.stream(new kWeakestRows().kWeakestRows(mat, 3)).forEach(System.out::print);

    }
}
