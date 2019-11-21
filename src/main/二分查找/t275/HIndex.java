package 二分查找.t275;

/**
 * @auther: sotowang
 * @date: 2019/11/21 21:38
 */
public class HIndex {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }
        int count = 1;
        int hIndex = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] >= count) {
                hIndex = count;
            }
            count++;
        }
        return hIndex;
    }

    public static void main(String[] args) {
        int[] citations = {0, 1, 3, 5, 6};
        System.out.println(new HIndex().hIndex(citations));
    }
}
