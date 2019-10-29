package 排序.t274;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @auther: sotowang
 * @date: 2019/10/29 20:56
 */
public class HIndex {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }
        //将引用次数排序,倒序
        citations = Arrays.stream(citations).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(e -> e.intValue())
                .toArray();
        int hIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            //找到引用次数比论文篇数多的数目,并记下当前引用次数
            if (citations[i] > i) {
                hIndex = i+1;
            }
        }
        return hIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 3, 1, 0, 6};
        System.out.println(new HIndex().hIndex(nums));
    }
}
