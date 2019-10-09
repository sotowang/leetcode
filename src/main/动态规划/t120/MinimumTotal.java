package 动态规划.t120;

import com.sun.org.apache.xerces.internal.xs.LSInputList;
import 动态规划.t64.MinPathSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/09 20:02
 */
public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int[] dept = new int[row];
        //自底向上
        for (int i = 0; i < row; i++) {
            dept[i] = triangle.get(row - 1).get(i);
        }
        for (int i = row - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dept[j] = Math.min(dept[j], dept[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dept[0];
    }


    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();
        List list4 = new ArrayList();
        list1.add(2);
        list2.add(3);
        list2.add(4);
        list3.add(6);
        list3.add(5);
        list3.add(7);
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);

        System.out.println(
                new MinimumTotal().
                        minimumTotal(triangle));
    }
}
