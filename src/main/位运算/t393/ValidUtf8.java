package 位运算.t393;

/**
 * @auther: sotowang
 * @date: 2020/2/27 21:35
 */
public class ValidUtf8 {
    public boolean validUtf8(int[] data) {
        for (int i = 0; i < data.length; i++) {
            //count为要处理的字节数
            int count = 0;
            int mask = 1 << 7;
            while ((mask & data[i]) != 0) {
                mask >>= 1;
                count++;
            }
            //如果超过4个字节则不为UTF-8
            if (count > 4 || count > data.length || count == 1) {
                return false;
            }
            //1个字节
            if (count == 0) {
                continue;
            }
            //检查接下来的data
            int mask2 = 1 << 6;
            int mask1 = 1 << 7;
            for (int j = i + 1; j < count + i; j++) {
                //检查第1位
                if ((mask1 & data[j]) == 0) {
                    return false;
                }
                //检查第二位
                if ((mask2 & data[j]) != 0) {
                    return false;
                }
            }
            i += count - 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(145));

        int[] data3 = new int[]{145};
        assert !new ValidUtf8().validUtf8(data3);
        int[] data2 = new int[]{237};
        assert !new ValidUtf8().validUtf8(data2);
        int[] data1 = new int[]{235, 140, 4};
        assert !new ValidUtf8().validUtf8(data1);
        int[] data = new int[]{197, 130, 1};
        assert new ValidUtf8().validUtf8(data);
    }
}
