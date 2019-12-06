package 数组.t118;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/06 19:48
 */
public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        int[][] array = new int[numRows][numRows];
        List<Integer> list = null;
        for (int i = 0; i < numRows; i++) {
            array[i][0] = 1;
            list = new ArrayList<>();
            list.add(array[i][0]);
            for (int j = 1; j <= i; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                list.add(array[i][j]);
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Generate().generate(5));
    }
}
